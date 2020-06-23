package co.com.factory.sample.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GenericUtils {

    private GenericUtils() {
    }

    private static Logger logger = Logger.getLogger(GenericUtils.class.getName());

    public static void infoLogger(String message) {
        logger.log(Level.INFO, message);
    }
}
