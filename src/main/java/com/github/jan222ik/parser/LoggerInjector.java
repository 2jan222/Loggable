package com.github.jan222ik.parser;

import com.github.jan222ik.Loggerable;
import com.github.jan222ik.annotations.LoggerableInjector;
import com.sun.istack.internal.NotNull;
import org.reflections.Reflections;
import org.reflections.scanners.FieldAnnotationsScanner;

import java.lang.reflect.Field;
import java.util.Set;

public class LoggerInjector {
    public LoggerInjector(@NotNull Loggerable logger, @NotNull String injectionPackage) {
        Reflections reflections = new Reflections(injectionPackage, new FieldAnnotationsScanner());
        Set<Field> fieldsAnnotatedWith = reflections.getFieldsAnnotatedWith(LoggerableInjector.class);
        for (Field field : fieldsAnnotatedWith) {
            field.setAccessible(true);
            try {
                System.out.println("Type = " + field.getType());
                System.out.println("field.getDeclaringClass().getName() = " + field.getDeclaringClass().getName());
                System.out.println("field.getClass() = " + field.getClass());
                Class<?> declaringClass = field.getDeclaringClass();
                System.out.println("declaringClass = " + declaringClass);
                //Field field1 = field.getDeclaringClass().getField(field.getName());
                Object o = declaringClass.newInstance(); //field1.getType().newInstance();
                field.set(o, logger);
            } catch (IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
