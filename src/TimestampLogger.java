import java.util.Date;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-20 22:27
 */

public class TimestampLogger implements Logger {

    private static final int ERROR = -1;

    private final Logger logger;
    private boolean freshline = true;

    public TimestampLogger(Logger logger) {
        this.logger = logger;
    }

    private void printTimestamp(int level) {
        if (freshline) {
            logger.print(level, new Date().toString() + ":");
        }
    }

    @Override
    public void print(int level, String msg) {
        printTimestamp(level);
        logger.print(level, msg);
        freshline = false;
    }

    @Override
    public void println(int level, String msg) {
        printTimestamp(level);
        logger.println(level, msg);
        freshline = true;
    }

    @Override
    public void logException(Throwable e) {
        printTimestamp(ERROR);
        logger.logException(e);
        freshline = true;
    }
}
