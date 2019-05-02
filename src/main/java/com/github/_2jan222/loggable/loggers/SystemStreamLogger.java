package com.github._2jan222.loggable.loggers;

import com.github._2jan222.loggable.LoggerColor;

/**
 * The SystemStreamLogger uses the system's out and err Stream to Log.
 *
 * @author Janik Mayr on 03.09.2018
 */
public class SystemStreamLogger extends AbstractLogger {
    /**
     * Log info message.
     *
     * @param info message to log
     */
    public void info(String info, LoggerColor... color) {
        if (visibility[0]) {
            System.out.println("[INFO]" + evaluate() + applyColor(info, color));
        }
    }

    /**
     * Log debug message.
     *
     * @param debug message to log
     */
    public void debug(String debug, LoggerColor... color) {
        if (visibility[1]) {
            System.out.println("[DEBUG]" + evaluate() + applyColor(debug, color));
        }
    }

    /**
     * Log warn message.
     *
     * @param warn message to log
     */
    public void warn(String warn, LoggerColor... color) {
        if (visibility[2]) {
            System.out.println("[WARNING]" + evaluate() + applyColor(warn, color));
        }
    }

    /**
     * Log error message.
     *
     * @param error message to log
     */
    public void error(String error, LoggerColor... color) {
        if (visibility[3]) {
            System.out.println("[ERROR]" + evaluate() + applyColor(error, color));
        }
    }

    /**
     * Log fatal error message.
     *
     * @param fatal message to log
     */
    public void fatal(String fatal, LoggerColor... color) {
        if (visibility[4]) {
            System.out.println("[FATAL]" + evaluate() + applyColor(fatal, color));
        }
    }
}
