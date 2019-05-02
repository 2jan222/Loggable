package com.github.jan222ik.parser;

import com.github.jan222ik.annotations.LoggerableOptions;

public class LoggerableOptionsParser extends SecurityManager {
    public String parse(int depth) {
        Class aClass = getClassContext()[depth];
        LoggerableOptions annotation = (LoggerableOptions) aClass.getAnnotation(LoggerableOptions.class);
        return (annotation != null) ? ">" + annotation.value() + " " : " ";
    }
}
