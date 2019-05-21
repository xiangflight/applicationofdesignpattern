/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-20 21:48
 */

public interface Logger {

    /**
     * 输出log日志，不折行
     *
     * @param level 级别
     * @param msg   信息
     */
    void print(int level, String msg);

    /**
     * 输出log日志，折行
     *
     * @param level 级别
     * @param msg   信息
     */
    void println(int level, String msg);

    /**
     * 记录日志异常
     *
     * @param e 异常
     */
    void logException(Throwable e);

}
