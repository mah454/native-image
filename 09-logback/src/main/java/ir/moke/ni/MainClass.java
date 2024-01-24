package ir.moke.ni;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass {
    private static final Logger logger = LoggerFactory.getLogger(MainClass.class);

    static {
        System.out.println("Application started");
    }
    public static void main(String[] args) {
        logger.info("This is INFO log");
        logger.warn("This is WARN log");
        logger.debug("This is DEBUG log");
        logger.error("This is ERROR log");
        logger.trace("This is TRACE log");
    }
}
