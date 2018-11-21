package com.github._2jan222.loggers;

/**
 * Discards void jobs.
 * @author Janik Mayr on 03.09.2018
 */
public class VoidLogger extends AbstractLogger {
    /**
     * Void info message.
     *
     * @param info message to void
     */
    public void info(String info) {}

    /**
     * Void debug message.
     *
     * @param debug message to void
     */
    public void debug(String debug) {}

    /**
     * Void warn message.
     *
     * @param warn message to void
     */
    public void warn(String warn) {}

    /**
     * Void error message.
     *
     * @param error message to void
     */
    public void error(String error) {}

    /**
     * Void fatal error message.
     *
     * @param fatal message to void
     */
    public void fatal(String fatal) {}
}
