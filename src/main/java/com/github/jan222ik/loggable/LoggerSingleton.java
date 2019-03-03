package com.github.jan222ik.loggable;


import com.github.jan222ik.loggable.exceptions.LoggerableException;

/**
 * LoggerSingleton manages existing Loggers.
 * @author Janik Mayr on 27.09.2018
 */
public final class LoggerSingleton {
    private static Loggerable singleton;

    /**
     * Private Constructor to prohibit creation of this class.
     */
    private LoggerSingleton() { }

    /**
     * Setup the Logger to distribute.
     * @param logger Logger to distribute.
     */
    public static void setup(final Loggerable logger) {
        singleton = logger;
    }

    /**
     * Get the logger defined in setup.
     * @return a logger which implements Loggerable.
     */
    public static Loggerable getLoggerInstance() {
        if (singleton == null) {
            throw new LoggerableException("No logger defined");
        }
        return singleton;
    }
}
