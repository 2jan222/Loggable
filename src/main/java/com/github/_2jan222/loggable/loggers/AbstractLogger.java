package com.github._2jan222.loggable.loggers;

import com.github._2jan222.loggable.LoggerColor;
import com.github._2jan222.loggable.Loggerable;
import com.github._2jan222.loggable.parser.LoggerableOptionsParser;



public abstract class AbstractLogger implements Loggerable {
    private LoggerableOptionsParser parser = new LoggerableOptionsParser();
    boolean[] visibility = new boolean[]{true, true, true, true, true};
    String evaluate() {
        return parser.parse(4);
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

    public String applyColor(String target, LoggerColor... color) {
        if (color.length == 1) {
            return color[0].getValue() + target + " " + LoggerColor.ANSI_RESET.getValue();
        }
        return target;
    }
}
