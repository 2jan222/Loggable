package com.github.jan222ik;

import org.jetbrains.annotations.Contract;


/**
 * Logger operations.
 * @author Janik Mayr
 */
@SuppressWarnings({"unused", "UnusedReturnValue"})
public interface Loggerable {
    String INFO = "[INFO]";
    String DEBUG = "[DEBUG]";
    String WARN = "[WARN]";
    String ERROR = "[ERROR]";
    String FATAL = "[FATAL]";

    /**
     * Log info message.
     *
     * @param info to log
     */
    void info(boolean info);

    void info(char info);

    void info(char[] info);

    void info(double info);

    void info(float info);

    void info(int info);

    void info(long info);

    void info(Object info);

    void info(String info);

    void info(boolean info, LoggerableColor color);

    void info(char info, LoggerableColor color);

    void info(char[] info, LoggerableColor color);

    void info(double info, LoggerableColor color);

    void info(float info, LoggerableColor color);

    void info(int info, LoggerableColor color);

    void info(long info, LoggerableColor color);

    void info(Object info, LoggerableColor color);

    void info(String info, LoggerableColor color);

    /**
     * Log debug message.
     *
     * @param debug message to log
     */
    void debug(boolean debug);

    void debug(char debug);

    void debug(char[] debug);

    void debug(double debug);

    void debug(float debug);

    void debug(int debug);

    void debug(long debug);

    void debug(Object debug);

    void debug(String debug);

    void debug(boolean debug, LoggerableColor color);

    void debug(char debug, LoggerableColor color);

    void debug(char[] debug, LoggerableColor color);

    void debug(double debug, LoggerableColor color);

    void debug(float debug, LoggerableColor color);

    void debug(int debug, LoggerableColor color);

    void debug(long debug, LoggerableColor color);

    void debug(Object debug, LoggerableColor color);

    void debug(String debug, LoggerableColor color);

    /**
     * Log warn message.
     *
     * @param warn message to log
     */
    void warn(boolean warn);

    void warn(char warn);

    void warn(char[] warn);

    void warn(double warn);

    void warn(float warn);

    void warn(int warn);

    void warn(long warn);

    void warn(Object warn);

    void warn(String warn);

    void warn(boolean warn, LoggerableColor color);

    void warn(char warn, LoggerableColor color);

    void warn(char[] warn, LoggerableColor color);

    void warn(double warn, LoggerableColor color);

    void warn(float warn, LoggerableColor color);

    void warn(int warn, LoggerableColor color);

    void warn(long warn, LoggerableColor color);

    void warn(Object warn, LoggerableColor color);

    void warn(String warn, LoggerableColor color);

    /**
     * Log error message.
     *
     * @param error message to log
     */
    void error(boolean error);

    void error(char error);

    void error(char[] error);

    void error(double error);

    void error(float error);

    void error(int error);

    void error(long error);

    void error(Object error);

    void error(String error);

    void error(boolean error, LoggerableColor color);

    void error(char error, LoggerableColor color);

    void error(char[] error, LoggerableColor color);

    void error(double error, LoggerableColor color);

    void error(float error, LoggerableColor color);

    void error(int error, LoggerableColor color);

    void error(long error, LoggerableColor color);

    void error(Object error, LoggerableColor color);

    void error(String error, LoggerableColor color);

    /**
     * Log fatal error message.
     *
     * @param fatal message to log
     */
    void fatal(boolean fatal);

    void fatal(char fatal);

    void fatal(char[] fatal);

    void fatal(double fatal);

    void fatal(float fatal);

    void fatal(int fatal);

    void fatal(long fatal);

    void fatal(Object fatal);

    void fatal(String fatal);

    void fatal(boolean fatal, LoggerableColor color);

    void fatal(char fatal, LoggerableColor color);

    void fatal(char[] fatal, LoggerableColor color);

    void fatal(double fatal, LoggerableColor color);

    void fatal(float fatal, LoggerableColor color);

    void fatal(int fatal, LoggerableColor color);

    void fatal(long fatal, LoggerableColor color);

    void fatal(Object fatal, LoggerableColor color);

    void fatal(String fatal, LoggerableColor color);


    /*
     * Visibility Setters.
     */

    Loggerable setInfoVisibility(boolean infoVisibility);

    Loggerable setDebugVisibility(boolean debugVisibility);

    Loggerable setWarnVisibility(boolean warnVisibility);

    Loggerable setErrorVisibility(boolean errorVisibility);

    Loggerable setFatalVisibility(boolean fatalVisibility);

    /**
     * Changes on value change the way LoggerableClassDisplayName annotations are parsed.
     *
     * @param chainPath if true, the path is shown otherwise only the latest display name.
     */
    void setChainPath(boolean chainPath);

    /**
     * Maximum depth for parser.
     *
     * @param maxDepth max depth
     */
    void setMaxDepth(int maxDepth);

    static Loggerable getInstance() {
        return LoggerableSingleton.getLoggerInstance();
    }

    @SuppressWarnings("UnusedReturnValue")
    @Contract("!null -> !null; null -> null")
    static Loggerable setLogger(Loggerable logger) {
        return LoggerableSingleton.setup(logger);
    }

    /**
     * Closes all streams.
     */
    default void closeStreams() {/*NOTHING TO DO HERE*/}
}
