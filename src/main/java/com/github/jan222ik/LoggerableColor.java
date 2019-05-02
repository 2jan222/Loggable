package com.github.jan222ik;

import org.jetbrains.annotations.Contract;

/**
 * Colors for Logger.
 * @author Janik Mayr
 */
public enum LoggerableColor {
    ANSI_RESET("\u001B[0m"),
    ANSI_BLACK ("\u001B[30m"),
    ANSI_RED ("\u001B[31m"),
    ANSI_GREEN ("\u001B[32m"),
    ANSI_YELLOW ("\u001B[33m"),
    ANSI_BLUE ("\u001B[34m"),
    ANSI_PURPLE ("\u001B[35m"),
    ANSI_CYAN ("\u001B[36m"),
    ANSI_WHITE ("\u001B[37m"),
    NONE("");
    private String value;

    @Contract(pure = true)
    LoggerableColor(String ansiColorCode) {
        value = ansiColorCode;
    }

    @Contract("_, null -> param1")
    public static String applyColor(String text, LoggerableColor color) {
        if (color != null && color != LoggerableColor.NONE) {
            return color.getValue() + text + LoggerableColor.ANSI_RESET.getValue();
        }
        return text;
    }

    @Contract(pure = true)
    public String getValue() {
        return value;
    }
}
