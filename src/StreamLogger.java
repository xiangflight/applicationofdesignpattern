import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-21 07:46
 */

public class StreamLogger {

    private final OutputStream out;

    public StreamLogger(OutputStream out) {
        this.out = out;
    }

    public OutputStream getOut() {
        return out;
    }

    private static Logger getBaseLogger(PrintWriter writer) {
        final Logger nop = new NopLogger();
        final Logger base = Loggers.writer(writer);
        final Logger nepture_logger = new NeptureExceptionLogger(writer, nop);
        final Logger jaskell_logger = new JaskellExceptionLogger(writer, nop);
        return Loggers.sequence(new Logger[]{nepture_logger, jaskell_logger, base});
    }

    private static Logger getEchoLogger(PrintWriter writer) {
        final Logger nop = new NopLogger();
        return new ErrorMessageLogger(writer, nop);
    }

    private static Logger getErrorLogger(PrintWriter writer) {
        final Logger base = Loggers.writer(writer);
        final Logger err_logger = new ErrorMessageLogger(writer, base);
        final Logger jaskell_logger = new JaskellExceptionLogger(writer, err_logger);
        final Logger nepture_logger = new NeptureExceptionLogger(writer, jaskell_logger);
        return nepture_logger;
    }
}
