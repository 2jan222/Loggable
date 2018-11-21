package com.github._2jan222.loggers;

/**
 * The SystemStreamLogger uses the system's out and err Stream to Log.
 * @author Janik Mayr on 03.09.2018
 */
public class SystemStreamLogger extends AbstractLogger {
    /**
     * Log info message.
     * @param info message to log
     */
    public void info(String info) {
        System.out.println("[INFO]"+ evaluate() + info);
    }

    /**
     * Log debug message.
     * @param debug message to log
     */
    public void debug(String debug) {
        System.out.println("[DEBUG]"+ evaluate() + debug);
    }

    /**
     * Log warn message.
     * @param warn message to log
     */
    public void warn(String warn) {System.out.println("[WARNING]"+ evaluate() + warn);
    }

    /**
     * Log error message.
     * @param error message to log
     */
    public void error(String error) {
        System.out.println("[ERROR]"+ evaluate() + error);
    }

    /**
     * Log fatal error message.
     * @param fatal message to log
     */
    public void fatal(String fatal) {
        System.err.println(fatal);
    }
}
