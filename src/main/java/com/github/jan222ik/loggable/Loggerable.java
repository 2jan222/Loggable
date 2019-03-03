package com.github.jan222ik.loggable;

/**
 * Logger interface for logger integration in the future.
 * @author Janik Mayr on 03.09.2018
 */
public interface Loggerable {

    /**
     * Log info message.
     * @param info message to log
     */
    void info(String info, LoggerColor... color);

    /**
     * Log debug message.
     * @param debug message to log
     */
    void debug(String debug, LoggerColor... color);

    /**
     * Log warn message.
     * @param warn message to log
     */
    void warn(String warn, LoggerColor... color);

    /**
     * Log error message.
     * @param error message to log
     */
    void error(String error, LoggerColor... color);

    /**
     * Log fatal error message.
     * @param fatal message to log
     */
    void fatal(String fatal, LoggerColor... color);

    /**
     * Closes all streams.
     */
    default void closeStreams(){/*NOTHING TO DO HERE*/}

    Loggerable setInfoVisibility(boolean infoVisibility);
    Loggerable setDebugVisibility(boolean debugVisibility);
    Loggerable setWarnVisibility(boolean warnVisibility);
    Loggerable setErrorVisibility(boolean errorVisibility);
    Loggerable setFatalVisibility(boolean fatalVisibility);

}
