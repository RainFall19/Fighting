import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class xxx {
    // 获取logger实列
    private static Logger logger = Logger.getLogger(xxx.class);

    public static void main(String[] args) throws Exception {
        // 定义输出log的级别
        logger.setLevel(Level.TRACE);

        // 输出log
        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
        logger.fatal("fatal message");
    }
}
