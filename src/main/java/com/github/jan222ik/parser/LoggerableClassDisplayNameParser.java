package com.github.jan222ik.parser;

import com.github.jan222ik.LoggerableColor;
import com.github.jan222ik.annotations.LoggerableClassDisplayName;

import java.util.LinkedList;
import java.util.stream.Collectors;


/**
 * Parser for LoggerableClassDisplayName annotation.
 * @author Janik Mayr
 */
public class LoggerableClassDisplayNameParser extends SecurityManager {
    public String parse(int maxDepth) {
        int i = 0;
        while (i <= maxDepth) {
            Class aClass = getClassContext()[i];
            LoggerableClassDisplayName annotation =
                    (LoggerableClassDisplayName) aClass.getAnnotation(LoggerableClassDisplayName.class);
            if (annotation != null) {
                return ">" + LoggerableColor.applyColor(annotation.value(), annotation.color()) + " ";
            }
            i++;
        }
       return " ";
    }

    public String parseContinueTilMax(int maxDepth) {
        int i = 0;
        LinkedList<LoggerableClassDisplayName> values = new LinkedList<>();
        while (i <= maxDepth) {
            Class aClass = getClassContext()[i];
            LoggerableClassDisplayName annotation =
                    (LoggerableClassDisplayName) aClass.getAnnotation(LoggerableClassDisplayName.class);
            if (annotation != null) {
                values.addFirst(annotation);
            }
            i++;
        }
        return values.stream()
                .map(e -> ">" + LoggerableColor.applyColor(e.value(), e.color())).collect(Collectors.joining()) + " ";
    }

}
