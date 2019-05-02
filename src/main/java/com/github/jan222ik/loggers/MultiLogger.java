package com.github.jan222ik.loggers;


import com.github.jan222ik.Loggerable;

/**
 * MultiLogger relegates the massage to all given loggers.
 * @author Janik Mayr on 27.10.2018
 */
public class MultiLogger extends AbstractLogger {

    private Loggerable[] loggers;

    private MultiLogger(){}

    public MultiLogger(Loggerable... logger) {
        loggers = logger;
    }

    /**
     * Log info message.
     * @param info message to log
     */
    public void info(String info) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.info(info);
            }
        }
    }

    /**
     * Log debug message.
     * @param debug message to log
     */
    public void debug(String debug) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.debug(debug);
            }
        }
    }

    /**
     * Log warn message.
     * @param warn message to log
     */
    public void warn(String warn) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.warn(warn);
            }
        }
    }

    /**
     * Log error message.
     * @param error message to log
     */
    public void error(String error) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.error(error);
            }
        }
    }

    /**
     * Log fatal error message.
     * @param fatal message to log
     */
    public void fatal(String fatal) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.fatal(fatal);
            }
        }
    }

    /**
     * Closes all streams.
     */
    @Override
    public void closeStreams() {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.closeStreams();
            }
        }
    }
}
