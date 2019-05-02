package com.github.jan222ik.loggers;


import com.github.jan222ik.Loggerable;
import com.github.jan222ik.LoggerableColor;
import org.jetbrains.annotations.Nullable;

/**
 * MultiLogger relegates the massages to all given loggers.
 *
 * @author Janik Mayr
 */
public class MultiLogger extends AbstractLogger {

    private Loggerable[] loggers;

    public MultiLogger(@Nullable Loggerable... logger) {
        loggers = logger;
        if (logger != null) {
            for (Loggerable l : logger) {
                if (l != null) {
                    l.setMaxDepth(5);
                }
            }
        }
    }

    @Override
    public void setMaxDepth(int max) {
        super.setMaxDepth(max);
        if (loggers != null) {
            for (Loggerable l : loggers) {
                if (l != null) {
                    l.setMaxDepth(max);
                }
            }
        }
    }

    @Override
    public void setChainPath(boolean chainPath) {
        super.setChainPath(chainPath);
        if (loggers != null) {
            for (Loggerable l : loggers) {
                if (l != null) {
                    l.setChainPath(chainPath);
                }
            }
        }
    }

    /**
     * Log info message.
     *
     * @param info message to log
     */
    @Override
    public void info(String info) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.info(info);
            }
        }
    }

    @Override
    public void info(String info, LoggerableColor color) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.info(info, color);
            }
        }
    }

    /**
     * Log debug message.
     *
     * @param debug message to log
     */
    public void debug(String debug) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.debug(debug);
            }
        }
    }

    @Override
    public void debug(String debug, LoggerableColor color) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.debug(debug, color);
            }
        }
    }

    /**
     * Log warn message.
     *
     * @param warn message to log
     */
    public void warn(String warn) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.warn(warn);
            }
        }
    }

    @Override
    public void warn(String warn, LoggerableColor color) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.warn(warn, color);
            }
        }
    }

    /**
     * Log error message.
     *
     * @param error message to log
     */
    public void error(String error) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.error(error);
            }
        }
    }

    @Override
    public void error(String error, LoggerableColor color) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.error(error, color);
            }
        }
    }

    /**
     * Log fatal error message.
     *
     * @param fatal message to log
     */
    public void fatal(String fatal) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.fatal(fatal);
            }
        }
    }

    @Override
    public void fatal(String fatal, LoggerableColor color) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.fatal(fatal, color);
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
                l.setInfoVisibility(debugVisibility);
            }
        }
        return this;
    }

    @Override
    public Loggerable setWarnVisibility(boolean warnVisibility) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.setInfoVisibility(warnVisibility);
            }
        }
        return this;
    }

    @Override
    public Loggerable setErrorVisibility(boolean errorVisibility) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.setInfoVisibility(errorVisibility);
            }
        }
        return this;
    }

    @Override
    public Loggerable setFatalVisibility(boolean fatalVisibility) {
        if (loggers != null) {
            for (Loggerable l : loggers) {
                l.setInfoVisibility(fatalVisibility);
            }
        }
        return this;
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
