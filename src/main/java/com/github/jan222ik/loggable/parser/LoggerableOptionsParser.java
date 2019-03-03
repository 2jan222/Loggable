package com.github.jan222ik.loggable.parser;

import com.github.jan222ik.loggable.annotations.LoggerableOptions;

public class LoggerableOptionsParser extends SecurityManager {
    public String parse(int depth) {
        //FIXME update depth for non multiloggers to 3;
        /*
        for (int i = 0; i < depth+2; i++) {
            System.out.println(i + ":" + getClassContext()[i].toString());
        }
        */
        Class aClass = getClassContext()[depth];
        LoggerableOptions annotation = (LoggerableOptions) aClass.getAnnotation(LoggerableOptions.class);
        return (annotation != null) ? ">" + annotation.value() + " ":" ";
    }
}
