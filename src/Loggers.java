import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-20 22:39
 */

public class Loggers {

    static Logger nop() {
        return new NopLogger();
    }

    static Logger writer(PrintWriter writer) {
        return new WriterLogger(writer);
    }

    static Logger writer(OutputStream outputStrewm) {
        return writer(new PrintWriter(outputStrewm, true));
    }

    static Logger filter(int lvl, Logger l1, Logger l2) {
        return new FilteredLogger(l1, l2, lvl);
    }

    static Logger ignore(Logger l1, Logger l2, int lvl) {
        return new IgnoringLogger(l1, l2, lvl);
    }

    static Logger timestamp(Logger logger) {
        return new TimestampLogger(logger);
    }

    static Logger sequence(Logger[] loggers) {
        return new SequenceLogger(loggers);
    }

}
