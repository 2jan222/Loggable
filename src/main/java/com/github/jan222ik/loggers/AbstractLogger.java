package com.github.jan222ik.loggers;

import com.github.jan222ik.Loggerable;
import com.github.jan222ik.LoggerableColor;
import com.github.jan222ik.parser.LoggerableClassDisplayNameParser;


/**
 * AbstractBase of Logger.
 * @author Janik Mayr
 */
public abstract class AbstractLogger implements Loggerable {
    private LoggerableClassDisplayNameParser parser = new LoggerableClassDisplayNameParser();
    boolean[] visibility = new boolean[]{true, true, true, true, true};
    private int maxDepth = 4;
    private boolean pathContextParse = false;

    String evaluate() {
        if (!pathContextParse) {
            return parser.parse(maxDepth);
        } else {
            return parser.parseContinueTilMax(maxDepth);
        }
    }

    public void setMaxDepth(@SuppressWarnings("SameParameterValue") int max) {
        maxDepth = max;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        closeStreams();
    }

    @Override
    public Loggerable setInfoVisibility(boolean infoVisibility) {
        visibility[0] = infoVisibility;
        return this;
    }

    @Override
    public Loggerable setDebugVisibility(boolean debugVisibility) {
        visibility[1] = debugVisibility;
        return this;
    }

    @Override
    public Loggerable setWarnVisibility(boolean warnVisibility) {
        visibility[2] = warnVisibility;
        return this;
    }

    @Override
    public Loggerable setErrorVisibility(boolean errorVisibility) {
        visibility[3] = errorVisibility;
        return this;
    }

    @Override
    public Loggerable setFatalVisibility(boolean fatalVisibility) {
        visibility[4] = fatalVisibility;
        return this;
    }

    @Override
    public void info(boolean info) {
        info(String.valueOf(info));
    }

    @Override
    public void info(char info) {
        info(String.valueOf(info));
    }

    @Override
    public void info(char[] info) {
        info(String.valueOf(info));
    }

    @Override
    public void info(double info) {
        info(String.valueOf(info));
    }

    @Override
    public void info(float info) {
        info(String.valueOf(info));
    }

    @Override
    public void info(int info) {
        info(String.valueOf(info));
    }

    @Override
    public void info(long info) {
        info(String.valueOf(info));
    }

    @Override
    public void info(Object info) {
        info(String.valueOf(info));
    }

    @Override
    public void info(boolean info, LoggerableColor color) {
        info(String.valueOf(info), color);
    }

    @Override
    public void info(char info, LoggerableColor color) {
        info(String.valueOf(info), color);
    }

    @Override
    public void info(char[] info, LoggerableColor color) {
        info(String.valueOf(info), color);
    }

    @Override
    public void info(double info, LoggerableColor color) {
        info(String.valueOf(info), color);
    }

    @Override
    public void info(float info, LoggerableColor color) {
        info(String.valueOf(info), color);
    }

    @Override
    public void info(int info, LoggerableColor color) {
        info(String.valueOf(info), color);
    }

    @Override
    public void info(long info, LoggerableColor color) {
        info(String.valueOf(info), color);
    }

    @Override
    public void info(Object info, LoggerableColor color) {
        info(String.valueOf(info), color);
    }

    @Override //Avoids color
    public void info(String info, LoggerableColor color) {
        info(info);
    }

    @Override
    public void debug(boolean debug) {
        debug(String.valueOf(debug));
    }

    @Override
    public void debug(char debug) {
        debug(String.valueOf(debug));
    }

    @Override
    public void debug(char[] debug) {
        debug(String.valueOf(debug));
    }

    @Override
    public void debug(double debug) {
        debug(String.valueOf(debug));
    }

    @Override
    public void debug(float debug) {
        debug(String.valueOf(debug));
    }

    @Override
    public void debug(int debug) {
        debug(String.valueOf(debug));
    }

    @Override
    public void debug(long debug) {
        debug(String.valueOf(debug));
    }

    @Override
    public void debug(Object debug) {
        debug(String.valueOf(debug));
    }

    @Override
    public void debug(boolean debug, LoggerableColor color) {
        debug(String.valueOf(debug), color);
    }

    @Override
    public void debug(char debug, LoggerableColor color) {
        debug(String.valueOf(debug), color);
    }

    @Override
    public void debug(char[] debug, LoggerableColor color) {
        debug(String.valueOf(debug), color);
    }

    @Override
    public void debug(double debug, LoggerableColor color) {
        debug(String.valueOf(debug), color);
    }

    @Override
    public void debug(float debug, LoggerableColor color) {
        debug(String.valueOf(debug), color);
    }

    @Override
    public void debug(int debug, LoggerableColor color) {
        debug(String.valueOf(debug), color);
    }

    @Override
    public void debug(long debug, LoggerableColor color) {
        debug(String.valueOf(debug), color);
    }

    @Override
    public void debug(Object debug, LoggerableColor color) {
        debug(String.valueOf(debug), color);
    }

    @Override //Avoids color
    public void debug(String debug, LoggerableColor color) {
        debug(debug);
    }

    @Override
    public void warn(boolean warn) {
        warn(String.valueOf(warn));
    }

    @Override
    public void warn(char warn) {
        warn(String.valueOf(warn));
    }

    @Override
    public void warn(char[] warn) {
        warn(String.valueOf(warn));
    }

    @Override
    public void warn(double warn) {
        warn(String.valueOf(warn));
    }

    @Override
    public void warn(float warn) {
        warn(String.valueOf(warn));
    }

    @Override
    public void warn(int warn) {
        warn(String.valueOf(warn));
    }

    @Override
    public void warn(long warn) {
        warn(String.valueOf(warn));
    }

    @Override
    public void warn(Object warn) {
        warn(String.valueOf(warn));
    }

    @Override
    public void warn(boolean warn, LoggerableColor color) {
        warn(String.valueOf(warn), color);
    }

    @Override
    public void warn(char warn, LoggerableColor color) {
        warn(String.valueOf(warn), color);
    }

    @Override
    public void warn(char[] warn, LoggerableColor color) {
        warn(String.valueOf(warn), color);
    }

    @Override
    public void warn(double warn, LoggerableColor color) {
        warn(String.valueOf(warn), color);
    }

    @Override
    public void warn(float warn, LoggerableColor color) {
        warn(String.valueOf(warn), color);
    }

    @Override
    public void warn(int warn, LoggerableColor color) {
        warn(String.valueOf(warn), color);
    }

    @Override
    public void warn(long warn, LoggerableColor color) {
        warn(String.valueOf(warn), color);
    }

    @Override
    public void warn(Object warn, LoggerableColor color) {
        warn(String.valueOf(warn), color);
    }

    @Override //Avoids color
    public void warn(String warn, LoggerableColor color) {
        warn(warn);
    }

    @Override
    public void error(boolean error) {
        error(String.valueOf(error));
    }

    @Override
    public void error(char error) {
        error(String.valueOf(error));
    }

    @Override
    public void error(char[] error) {
        error(String.valueOf(error));
    }

    @Override
    public void error(double error) {
        error(String.valueOf(error));
    }

    @Override
    public void error(float error) {
        error(String.valueOf(error));
    }

    @Override
    public void error(int error) {
        error(String.valueOf(error));
    }

    @Override
    public void error(long error) {
        error(String.valueOf(error));
    }

    @Override
    public void error(Object error) {
        error(String.valueOf(error));
    }

    @Override
    public void error(boolean error, LoggerableColor color) {
        error(String.valueOf(error), color);
    }

    @Override
    public void error(char error, LoggerableColor color) {
        error(String.valueOf(error), color);
    }

    @Override
    public void error(char[] error, LoggerableColor color) {
        error(String.valueOf(error), color);
    }

    @Override
    public void error(double error, LoggerableColor color) {
        error(String.valueOf(error), color);
    }

    @Override
    public void error(float error, LoggerableColor color) {
        error(String.valueOf(error), color);
    }

    @Override
    public void error(int error, LoggerableColor color) {
        error(String.valueOf(error), color);
    }

    @Override
    public void error(long error, LoggerableColor color) {
        error(String.valueOf(error), color);
    }

    @Override
    public void error(Object error, LoggerableColor color) {
        error(String.valueOf(error), color);
    }

    @Override //Avoids color
    public void error(String error, LoggerableColor color) {
        error(error);
    }

    @Override
    public void fatal(boolean fatal) {
        fatal(String.valueOf(fatal));
    }

    @Override
    public void fatal(char fatal) {
        fatal(String.valueOf(fatal));
    }

    @Override
    public void fatal(char[] fatal) {
        fatal(String.valueOf(fatal));
    }

    @Override
    public void setChainPath(boolean chainPath) {
        pathContextParse = chainPath;
    }

    @Override
    public void fatal(double fatal) {
        fatal(String.valueOf(fatal));
    }

    @Override
    public void fatal(float fatal) {
        fatal(String.valueOf(fatal));
    }

    @Override
    public void fatal(int fatal) {
        fatal(String.valueOf(fatal));
    }

    @Override
    public void fatal(long fatal) {
        fatal(String.valueOf(fatal));
    }

    @Override
    public void fatal(Object fatal) {
        fatal(String.valueOf(fatal));
    }

    @Override
    public void fatal(boolean fatal, LoggerableColor color) {
        fatal(String.valueOf(fatal), color);
    }

    @Override
    public void fatal(char fatal, LoggerableColor color) {
        fatal(String.valueOf(fatal), color);
    }

    @Override
    public void fatal(char[] fatal, LoggerableColor color) {
        fatal(String.valueOf(fatal), color);
    }

    @Override
    public void fatal(double fatal, LoggerableColor color) {
        fatal(String.valueOf(fatal), color);
    }

    @Override
    public void fatal(float fatal, LoggerableColor color) {
        fatal(String.valueOf(fatal), color);
    }

    @Override
    public void fatal(int fatal, LoggerableColor color) {
        fatal(String.valueOf(fatal), color);
    }

    @Override
    public void fatal(long fatal, LoggerableColor color) {
        fatal(String.valueOf(fatal), color);
    }

    @Override
    public void fatal(Object fatal, LoggerableColor color) {
        fatal(String.valueOf(fatal), color);
    }

    @Override //Avoids color
    public void fatal(String fatal, LoggerableColor color) {
        fatal(fatal);
    }

}
