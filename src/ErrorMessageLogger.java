import java.io.PrintWriter;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-20 22:18
 */

public class ErrorMessageLogger implements Logger {

    private final PrintWriter out;
    private final Logger logger;

    public ErrorMessageLogger(PrintWriter out, Logger logger) {
        this.out = out;
        this.logger = logger;
    }

    @Override
    public void print(int level, String msg) {
        logger.print(level, msg);
    }

    @Override
    public void println(int level, String msg) {
        logger.println(level, msg);
    }

    @Override
    public void logException(Throwable e) {
        out.println(e.getMessage());
    }
}
