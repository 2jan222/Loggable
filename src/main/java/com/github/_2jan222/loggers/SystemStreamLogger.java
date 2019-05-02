package com.github._2jan222.loggers;

import java.util.Arrays;

/**
 * The SystemStreamLogger uses the system's out and err Stream to Log.
 *
 * @author Janik Mayr on 03.09.2018
 */
public class SystemStreamLogger extends AbstractLogger {
    /**
     * Log info message.
     *
     * @param info message to log
     */
    @Override
    public void info(String info) {
        System.out.println("[INFO]" + evaluate() + info);
    }

    @Override
    public void info(char info) {
        System.out.println("[INFO]" + evaluate() + info);
    }

    @Override
    public void info(int info) {
        System.out.println("[INFO]" + evaluate() + info);
    }

    @Override
    public void info(double info) {
        System.out.println("[INFO]" + evaluate() + info);
    }

    @Override
    public void info(Object info) {
        System.out.println("[INFO]" + evaluate() + info);
    }

    @Override
    public void info(float info) {
        System.out.println("[INFO]" + evaluate() + info);
    }

    @Override
    public void info(Object[] infoArray) {
        System.out.println("[INFO]" + evaluate() + Arrays.toString(infoArray));
    }

    @Override
    public void info(boolean info) {
        System.out.println("[INFO]" + evaluate() + info);
    }

    @Override
    public void info(long info) {
        System.out.println("[INFO]" + evaluate() + info);
    }

    @Override
    public void info(short info) {
        System.out.println("[INFO]" + evaluate() + info);
    }

    @Override
    public void info(byte info) {
        System.out.println("[INFO]" + evaluate() + info);
    }


    /**
     * Log debug message.
     *
     * @param debug message to log
     */
    public void debug(String debug) {
        System.out.println("[DEBUG]" + evaluate() + debug);
    }
    @Override
    public void debug(char debug) {
        System.out.println("[DEBUG]" + evaluate() + debug);
    }

    @Override
    public void debug(int debug) {
        System.out.println("[DEBUG]" + evaluate() + debug);
    }

    @Override
    public void debug(double debug) {
        System.out.println("[DEBUG]" + evaluate() + debug);
    }

    @Override
    public void debug(Object debug) {
        System.out.println("[DEBUG]" + evaluate() + debug);
    }

    @Override
    public void debug(float debug) {
        System.out.println("[DEBUG]" + evaluate() + debug);
    }

    @Override
    public void debug(Object[] debugArray) {
        System.out.println("[DEBUG]" + evaluate() + Arrays.toString(debugArray));
    }

    @Override
    public void debug(boolean debug) {
        System.out.println("[DEBUG]" + evaluate() + debug);
    }

    @Override
    public void debug(long debug) {
        System.out.println("[DEBUG]" + evaluate() + debug);
    }

    @Override
    public void debug(short debug) {
        System.out.println("[DEBUG]" + evaluate() + debug);
    }

    @Override
    public void debug(byte debug) {
        System.out.println("[DEBUG]" + evaluate() + debug);
    }

    /**
     * Log warn message.
     *
     * @param warn message to log
     */
    public void warn(String warn) {
        System.out.println("[WARNING]" + evaluate() + warn);
    }
    @Override
    public void warn(char warn) {
        System.out.println("[WARNING]" + evaluate() + warn);
    }

    @Override
    public void warn(int warn) {
        System.out.println("[WARNING]" + evaluate() + warn);
    }

    @Override
    public void warn(double warn) {
        System.out.println("[WARNING]" + evaluate() + warn);
    }

    @Override
    public void warn(Object warn) {
        System.out.println("[WARNING]" + evaluate() + warn);
    }

    @Override
    public void warn(float warn) {
        System.out.println("[WARNING]" + evaluate() + warn);
    }

    @Override
    public void warn(Object[] warnArray) {
        System.out.println("[WARNING]" + evaluate() + Arrays.toString(warnArray));
    }

    @Override
    public void warn(boolean warn) {
        System.out.println("[WARNING]" + evaluate() + warn);
    }

    @Override
    public void warn(long warn) {
        System.out.println("[WARNING]" + evaluate() + warn);
    }

    @Override
    public void warn(short warn) {
        System.out.println("[WARNING]" + evaluate() + warn);
    }

    @Override
    public void warn(byte warn) {
        System.out.println("[WARNING]" + evaluate() + warn);
    }

    /**
     * Log error message.
     *
     * @param error message to log
     */
    public void error(String error) {
        System.out.println("[ERROR]" + evaluate() + error);
    }
    @Override
    public void error(char error) {
        System.out.println("[ERROR]" + evaluate() + error);
    }

    @Override
    public void error(int error) {
        System.out.println("[ERROR]" + evaluate() + error);
    }

    @Override
    public void error(double error) {
        System.out.println("[ERROR]" + evaluate() + error);
    }

    @Override
    public void error(Object error) {
        System.out.println("[ERROR]" + evaluate() + error);
    }

    @Override
    public void error(float error) {
        System.out.println("[ERROR]" + evaluate() + error);
    }

    @Override
    public void error(Object[] errorArray) {
        System.out.println("[ERROR]" + evaluate() + Arrays.toString(errorArray));
    }

    @Override
    public void error(boolean error) {
        System.out.println("[ERROR]" + evaluate() + error);
    }

    @Override
    public void error(long error) {
        System.out.println("[ERROR]" + evaluate() + error);
    }

    @Override
    public void error(short error) {
        System.out.println("[ERROR]" + evaluate() + error);
    }

    @Override
    public void error(byte error) {
        System.out.println("[ERROR]" + evaluate() + error);
    }

    /**
     * Log fatal error message.
     *
     * @param fatal message to log
     */
    public void fatal(String fatal) {
        System.err.println(fatal);
    }
    @Override
    public void fatal(char fatal) {
        System.out.println("[FATAL]" + evaluate() + fatal);
    }

    @Override
    public void fatal(int fatal) {
        System.out.println("[FATAL]" + evaluate() + fatal);
    }

    @Override
    public void fatal(double fatal) {
        System.out.println("[FATAL]" + evaluate() + fatal);
    }

    @Override
    public void fatal(Object fatal) {
        System.out.println("[FATAL]" + evaluate() + fatal);
    }

    @Override
    public void fatal(float fatal) {
        System.out.println("[FATAL]" + evaluate() + fatal);
    }

    @Override
    public void fatal(Object[] fatalArray) {
        System.out.println("[FATAL]" + evaluate() + Arrays.toString(fatalArray));
    }

    @Override
    public void fatal(boolean fatal) {
        System.out.println("[FATAL]" + evaluate() + fatal);
    }

    @Override
    public void fatal(long fatal) {
        System.out.println("[FATAL]" + evaluate() + fatal);
    }

    @Override
    public void fatal(short fatal) {
        System.out.println("[FATAL]" + evaluate() + fatal);
    }

    @Override
    public void fatal(byte fatal) {
        System.out.println("[FATAL]" + evaluate() + fatal);
    }
}
