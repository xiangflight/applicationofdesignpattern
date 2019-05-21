import exception.EvaluationException;

import java.io.PrintWriter;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-20 22:25
 */

public class JaskellExceptionLogger implements Logger {

    private final PrintWriter out;
    private final Logger logger;

    public JaskellExceptionLogger(PrintWriter out, Logger logger) {
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
        if (e instanceof EvaluationException) {
            ((EvaluationException) e).printEvaluationTrace(out);
        } else {
            logger.logException(e);
        }
    }
}
