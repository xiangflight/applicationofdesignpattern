/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-20 22:09
 */

public class FilteredLogger implements Logger {

    private static final int ERROR = -1;

    private final Logger logger1;
    private final Logger logger2;
    private final int level;

    FilteredLogger(Logger logger1, Logger logger2, int level) {
        this.logger1 = logger1;
        this.logger2 = logger2;
        this.level = level;
    }

    @Override
    public void print(int level, String msg) {
        if (level == this.level) {
            logger1.print(level, msg);
        } else {
            logger2.print(level, msg);
        }
    }

    @Override
    public void println(int level, String msg) {
        if (level == this.level) {
            logger1.println(level, msg);
        } else {
            logger2.println(level, msg);
        }
    }

    @Override
    public void logException(Throwable e) {
        if (this.level == ERROR) {
            logger1.logException(e);
        } else {
            logger2.logException(e);
        }
    }

}
