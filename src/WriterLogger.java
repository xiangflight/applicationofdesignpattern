import java.io.PrintWriter;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-20 22:03
 */

public class WriterLogger implements Logger {

    private final PrintWriter writer;

    WriterLogger(PrintWriter writer) {
        this.writer = writer;
    }

    @Override
    public void print(int level, String msg) {
        writer.print(msg);
    }

    @Override
    public void println(int level, String msg) {
        writer.println(msg);
    }

    @Override
    public void logException(Throwable e) {
        e.printStackTrace(writer);
    }
}
