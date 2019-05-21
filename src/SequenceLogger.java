/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-20 22:07
 */

public class SequenceLogger implements Logger {

    private final Logger[] loggers;

    SequenceLogger(Logger[] loggers) {
        this.loggers = loggers;
    }

    @Override
    public void print(int level, String msg) {
        for (Logger logger : loggers) {
            logger.print(level, msg);
        }
    }

    @Override
    public void println(int level, String msg) {
        for (Logger logger : loggers) {
            logger.println(level, msg);
        }
    }

    @Override
    public void logException(Throwable e) {
        for (Logger logger : loggers) {
            logger.logException(e);
        }
    }
}
