package com.github.jan222ik.loggable.loggers;


import com.github.jan222ik.loggable.LoggerColor;
import com.github.jan222ik.loggable.Loggerable;

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
    public void info(String info, LoggerColor... color) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.info(info, color);
            }
        }
    }

    /**
     * Log debug message.
     * @param debug message to log
     */
    public void debug(String debug, LoggerColor... color) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.debug(debug, color);
            }
        }
    }

    /**
     * Log warn message.
     * @param warn message to log
     */
    public void warn(String warn, LoggerColor... color) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.warn(warn, color);
            }
        }
    }

    /**
     * Log error message.
     * @param error message to log
     */
    public void error(String error, LoggerColor... color) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.error(error, color);
            }
        }
    }

    /**
     * Log fatal error message.
     * @param fatal message to log
     */
    public void fatal(String fatal, LoggerColor... color) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.fatal(fatal, color);
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

    @Override
    public Loggerable setInfoVisibility(boolean infoVisibility) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.setInfoVisibility(infoVisibility);
            }
        }
        return this;
    }

    @Override
    public Loggerable setDebugVisibility(boolean debugVisibility) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.setDebugVisibility(debugVisibility);
            }
        }
        return this;
    }

    @Override
    public Loggerable setWarnVisibility(boolean warnVisibility) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.setWarnVisibility(warnVisibility);
            }
        }
        return this;
    }

    @Override
    public Loggerable setErrorVisibility(boolean errorVisibility) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.setErrorVisibility(errorVisibility);
            }
        }
        return this;
    }

    @Override
    public Loggerable setFatalVisibility(boolean fatalVisibility) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.setFatalVisibility(fatalVisibility);
            }
        }
        return this;
    }
}
