package com.github.jan222ik;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * Logger interface for logger integration in the future.
 *
 * @author Janik Mayr on 03.09.2018
 */
public interface Loggerable {
    String ANSI_RESET = "\u001B[0m";
    String ANSI_BLACK = "\u001B[30m";
    String ANSI_RED = "\u001B[31m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_BLUE = "\u001B[34m";
    String ANSI_PURPLE = "\u001B[35m";
    String ANSI_CYAN = "\u001B[36m";
    String ANSI_WHITE = "\u001B[37m";

    static String fillColor(int r, int g, int b) {
        return "\033[38;2;" + r + ";" + g + ";" + b + "m";
    }

    static String backgrondColor(int r, int g, int b) {
        return "\033[48;2;" + r + ";" + g + ";" + b + "m";
    }

    static String fillColor(Color c) {
        return "\033[38;2;" + c.getRed() + ";" + c.getGreen() + ";" + c.getBlue() + "m";
    }

    static String backgrondColor(Color c) {
        List<String> f = new ArrayList<>();
        f.forEach(System.out::println);
        return "\033[48;2;" + c.getRed() + ";" + c.getGreen() + ";" + c.getBlue() + "m";
    }


    /**
     * Log info message.
     *
     * @param info message to log
     */
    void info(String info);
    void info(char c);
    void info(int i);
    void info(double d);
    void info(Object o);
    void info(float f);
    void info(Object[] array);
    void info(boolean b);
    void info(long l);
    void info(short s);
    void info(byte b);
    


    /**
     * Log debug message.
     *
     * @param debug message to log
     */
    void debug(String debug);
    void debug(char c);
    void debug(int i);
    void debug(double d);
    void debug(Object o);
    void debug(float f);
    void debug(Object[] array);
    void debug(boolean b);
    void debug(long l);
    void debug(short s);
    void debug(byte b);

    /**
     * Log warn message.
     *
     * @param warn message to log
     */
    void warn(String warn);
    void warn(char c);
    void warn(int i);
    void warn(double d);
    void warn(Object o);
    void warn(float f);
    void warn(Object[] array);
    void warn(boolean b);
    void warn(long l);
    void warn(short s);
    void warn(byte b);

    /**
     * Log error message.
     *
     * @param error message to log
     */
    void error(String error);
    void error(char c);
    void error(int i);
    void error(double d);
    void error(Object o);
    void error(float f);
    void error(Object[] array);
    void error(boolean b);
    void error(long l);
    void error(short s);
    void error(byte b);

    /**
     * Log fatal error message.
     *
     * @param fatal message to log
     */
    void fatal(String fatal);
    void fatal(char c);
    void fatal(int i);
    void fatal(double d);
    void fatal(Object o);
    void fatal(float f);
    void fatal(Object[] array);
    void fatal(boolean b);
    void fatal(long l);
    void fatal(short s);
    void fatal(byte b);

    /**
     * Closes all streams.
     */
    default void closeStreams() {/*NOTHING TO DO HERE*/}
}
