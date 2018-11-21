package com.github._2jan222;

/**
 * Logger interface for logger integration in the future.
 * @author Janik Mayr on 03.09.2018
 */
public interface Loggerable {
    String ANSI_RESET = "\u001B[0m";
    String ANSI_BLACK = "\u001B[30m";
    String ANSI_RED = "\u001B[31m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_BLUE = "\u001B[34m";
    String ANSI_PURPLE = "\u001B[35m";
    String ANSI_CYAN = "\u001B[36m";
    String ANSI_WHITE = "\u001B[37m";

    /**
     * Log info message.
     * @param info message to log
     */
    void info(String info);

    /**
     * Log debug message.
     * @param debug message to log
     */
    void debug(String debug);

    /**
     * Log warn message.
     * @param warn message to log
     */
    void warn(String warn);

    /**
     * Log error message.
     * @param error message to log
     */
    void error(String error);

    /**
     * Log fatal error message.
     * @param fatal message to log
     */
    void fatal(String fatal);

    /**
     * Closes all streams.
     */
    default void closeStreams(){/*NOTHING TO DO HERE*/}
}
