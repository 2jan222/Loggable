package com.github.jan222ik;


import com.github.jan222ik.annotations.LoggerableClassDisplayName;
import com.github.jan222ik.loggers.FileLogger;
import com.github.jan222ik.loggers.MultiLogger;
import com.github.jan222ik.loggers.SystemStreamLogger;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

@LoggerableClassDisplayName("[TEST CLASS]")
class Tester {

    @BeforeAll
    static void beforeAll() {
        Loggerable loggerable = new MultiLogger(new SystemStreamLogger());
        Loggerable.setLogger(loggerable);
    }

    @Test
    void testInfo() {
        int i = 0;
        Loggerable logger = Loggerable.getInstance();
        System.out.println();
        for (LoggerableColor c : LoggerableColor.values()) {
            logger.info("infoMsg " + i, c);
            i++;
        }
    }

    @Test
    void testWarn() {
        int i = 0;
        Loggerable logger = Loggerable.getInstance();
        System.out.println();
        for (LoggerableColor c : LoggerableColor.values()) {
            logger.warn("warnMsg " + i, c);
            i++;
        }
    }

    @Test
    void testDebug() {
        int i = 0;
        Loggerable logger = Loggerable.getInstance();
        System.out.println();
        for (LoggerableColor c : LoggerableColor.values()) {
            logger.debug("debugMsg " + i, c);
            i++;
        }
    }

    @Test
    void testError() {
        int i = 0;
        Loggerable logger = Loggerable.getInstance();
        System.out.println();
        for (LoggerableColor c : LoggerableColor.values()) {
            logger.error("errorMsg " + i, c);
            i++;
        }
    }

    @Test
    void testFatal() {
        int i = 0;
        Loggerable logger = Loggerable.getInstance();
        System.out.println();
        for (LoggerableColor c : LoggerableColor.values()) {
            logger.fatal("fatalMsg " + i, c);
            i++;
        }
    }

    @Test
    void FileLoggerCreation() {
        Assertions.assertThrows(NullPointerException.class, () -> new FileLogger((File) null));
        File notFile = new File("target/testContext/NotExistingPath/NotExistingFile.txt");
        notFile.delete(); //DELETE FILE
        notFile.getParentFile().delete(); //DELETE PACKAGE
        Assertions.assertThrows(FileNotFoundException.class, () -> new FileLogger(notFile, false, "UTF-8"));
        try {
            new FileLogger(notFile, true, "UTF-8");
        } catch (IOException e) {
            fail("Logger should have been initialized");
        }
        File file = new File("src/main/test/com/github/jan222ik/fileLoggerTestFile.txt");
        assertTrue(file.exists(), "File needs to exist, may be empty");
        Assertions.assertThrows(UnsupportedEncodingException.class, () -> new FileLogger(file, false, "UTF-6"));
        try {
            new FileLogger(file, false, "UTF-8");
        } catch (IOException e) {
            fail("Logger should have been initialized");
        }
    }

    @Test
    void chainTest() {
        System.out.println();
        Loggerable instance = Loggerable.getInstance();
        instance.setChainPath(true);
        instance.setMaxDepth(10);
        new A().callB(new B(), instance);
    }

    @LoggerableClassDisplayName(value = "[A-Colored]", color = LoggerableColor.ANSI_BLUE)
    class A {
        void callB(@NotNull Tester.B b, Loggerable logger) {
            b.getValue(logger);
        }
    }

    @LoggerableClassDisplayName(value = "[B-Colored]", color = LoggerableColor.ANSI_PURPLE)
    class B {
        void getValue(@NotNull Loggerable logger) {
            logger.info("Value: TEST");
        }
    }
}
