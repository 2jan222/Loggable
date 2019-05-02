package com.github._2jan222.loggable;


import com.github._2jan222.loggable.annotations.LoggerableOptions;
import com.github._2jan222.loggable.loggers.SystemStreamLogger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

@LoggerableOptions("CLASSLEVEL")
class Tester {

    @BeforeAll
    static void beforeAll() {
        //Loggerable loggerable = new MultiLogger(new SystemStreamLogger());
        Loggerable loggerable = new SystemStreamLogger();
        //loggerable.setDebugVisibility(false).setErrorVisibility(false).setFatalVisibility(false);
        LoggerSingleton.setup(loggerable);
    }

    @Test
    void testInfo() {
        int i = 0;
        Loggerable logger = LoggerSingleton.getLoggerInstance();
        System.out.println();
        for (LoggerColor c : LoggerColor.values()) {
            logger.info("infoMsg " + i, c);
            i++;
        }
    }

    @Test
    void testWarn() {
        int i = 0;
        Loggerable logger = LoggerSingleton.getLoggerInstance();
        System.out.println();
        for (LoggerColor c : LoggerColor.values()) {
            logger.warn("warnMsg " + i, c);
            i++;
        }
    }

    @Test
    void testDebug() {
        int i = 0;
        Loggerable logger = LoggerSingleton.getLoggerInstance();
        System.out.println();
        for (LoggerColor c : LoggerColor.values()) {
            logger.debug("debugMsg " + i, c);
            i++;
        }
    }

    @Test
    void testError() {
        int i = 0;
        Loggerable logger = LoggerSingleton.getLoggerInstance();
        System.out.println();
        for (LoggerColor c : LoggerColor.values()) {
            logger.error("errorMsg " + i, c);
            i++;
        }
    }

    @Test
    void testFatal() {
        int i = 0;
        Loggerable logger = LoggerSingleton.getLoggerInstance();
        System.out.println();
        for (LoggerColor c : LoggerColor.values()) {
            logger.fatal("fatalMsg " + i, c);
            i++;
        }
    }
}
