package exception;

import java.io.PrintWriter;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-20 22:23
 */

public class EvaluationException extends RuntimeException {

    public void printEvaluationTrace(PrintWriter out) {
        out.println(this.getMessage());
    }

}
