package com.github.jan222ik.annotations;

import com.github.jan222ik.LoggerableColor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for ClassLevelNameContext.
 *
 * @author Janik Mayr.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface LoggerableClassDisplayName {
    String value() default "";

    LoggerableColor color() default LoggerableColor.NONE;
}
