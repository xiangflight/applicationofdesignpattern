package exception;

import java.io.PrintWriter;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-20 22:21
 */

public class NeptureException extends RuntimeException {

    public void printExecutionTrace(PrintWriter out) {
        out.println(this.getMessage());
    }

}
