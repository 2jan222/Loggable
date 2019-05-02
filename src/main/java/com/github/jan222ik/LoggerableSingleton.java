package com.github.jan222ik;


import com.github.jan222ik.exceptions.LoggerableException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

/**
 * LoggerableSingleton manages the active Loggers.
 * @author Janik Mayr
 */
final class LoggerableSingleton {
    private static Loggerable singleton;

    /**
     * Private Constructor to prohibit creation of this class.
     */
    @Contract(pure = true)
    private LoggerableSingleton() { }

    /**
     * Setup the Logger to distribute.
     * @param logger Logger to distribute.
     * @return given logger.
     */
    @Contract("!null -> !null; null -> null")
    public static Loggerable setup(@Nullable final Loggerable logger) {
        singleton = logger;
        return singleton;
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
