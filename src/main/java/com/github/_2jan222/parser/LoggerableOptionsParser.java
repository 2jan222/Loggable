package com.github._2jan222.parser;

import com.github._2jan222.annotations.LoggerableOptions;

public class LoggerableOptionsParser extends SecurityManager {
    public String parse(int depth) {
        Class aClass = getClassContext()[depth];
        LoggerableOptions annotation = (LoggerableOptions) aClass.getAnnotation(LoggerableOptions.class);
        return (annotation != null) ? ">" + annotation.value() + " " : " ";
    }
}
