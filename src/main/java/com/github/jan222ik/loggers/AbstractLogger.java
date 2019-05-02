package com.github.jan222ik.loggers;

import com.github.jan222ik.Loggerable;
import com.github.jan222ik.parser.LoggerableOptionsParser;


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
