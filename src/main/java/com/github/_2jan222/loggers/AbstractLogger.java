package com.github._2jan222.loggers;

import com.github._2jan222.Loggerable;
import com.github._2jan222.parser.LoggerableOptionsParser;


public abstract class AbstractLogger implements Loggerable {
    private LoggerableOptionsParser parser = new LoggerableOptionsParser();
    String evaluate() {
        return parser.parse(4);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        closeStreams();
    }
}
