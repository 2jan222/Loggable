package com.github.jan222ik.loggers;

import com.github.jan222ik.LoggerableColor;


/**
 * The SystemStreamLogger uses the sysout stream to Log.
 */
public class SystemStreamLogger extends AbstractLogger {

    @Override
    public void info(String info) {
        if (visibility[0]) {
            print(INFO, info);
        }
    }

    @Override
    public void info(String info, LoggerableColor color) {
        if (visibility[0]) {
            print(INFO, info, color);
        }
    }

    @Override
    public void debug(String debug) {
        if (visibility[1]) {
            print(DEBUG, debug);
        }
    }

    @Override
    public void debug(String debug, LoggerableColor color) {
        if (visibility[1]) {
            print(DEBUG, debug, color);
        }
    }

    @Override
    public void warn(String warn) {
        if (visibility[2]) {
            print(WARN, warn);
        }
    }

    @Override
    public void warn(String warn, LoggerableColor color) {
        if (visibility[2]) {
            print(WARN, warn, color);
        }
    }

    @Override
    public void error(String error) {
        if (visibility[3]) {
            print(ERROR, error);
        }
    }

    @Override
    public void error(String error, LoggerableColor color) {
        if (visibility[3]) {
            print(ERROR, error, color);
        }
    }

    @Override
    public void fatal(String fatal) {
        if (visibility[4]) {
            print(FATAL, fatal);
        }
    }

    @Override
    public void fatal(String fatal, LoggerableColor color) {
        if (visibility[4]) {
            print(FATAL, fatal, color);
        }
    }

    private void print(String typeName, String message) {
        System.out.println(typeName + evaluate() + message);
    }

    private void print(String typeName, String message, LoggerableColor color) {
        print(typeName, LoggerableColor.applyColor(message, color));
    }

}
