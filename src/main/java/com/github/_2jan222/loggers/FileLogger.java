package com.github._2jan222.loggers;

import com.github._2jan222.exceptions.LoggerableException;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @author Janik Mayr on 27.10.2018
 */
public class FileLogger extends AbstractLogger {

    private PrintWriter writer;

    private FileLogger() {
    }

    public FileLogger(PrintWriter writer) {
        this.writer = writer;
        if (writer == null) {
            throw new LoggerableException("PrintWriter resulted in NPE");
        }
    }

    /**
     * Log info message.
     *
     * @param info message to log
     */
    public void info(String info) {
        writer.println(LocalDateTime.now().toString() + "[INFO] " + evaluate() + info);
        writer.flush();
    }

    @Override
    public void info(char info) {
        writer.println(LocalDateTime.now().toString() + "[INFO] " + evaluate() + info);
        writer.flush();
    }

    @Override
    public void info(int info) {
        writer.println(LocalDateTime.now().toString() + "[INFO] " + evaluate() + info);
        writer.flush();
    }

    @Override
    public void info(double info) {
        writer.println(LocalDateTime.now().toString() + "[INFO] " + evaluate() + info);
        writer.flush();
    }

    @Override
    public void info(Object info) {
        writer.println(LocalDateTime.now().toString() + "[INFO] " + evaluate() + info.toString());
        writer.flush();
    }

    @Override
    public void info(float info) {
        writer.println(LocalDateTime.now().toString() + "[INFO] " + evaluate() + info);
        writer.flush();
    }

    @Override
    public void info(Object[] infoArray) {
        writer.println(LocalDateTime.now().toString() + "[INFO] " + evaluate() + Arrays.toString(infoArray));
        writer.flush();
    }

    @Override
    public void info(boolean info) {
        writer.println(LocalDateTime.now().toString() + "[INFO] " + evaluate() + info);
        writer.flush();
    }

    @Override
    public void info(long info) {
        writer.println(LocalDateTime.now().toString() + "[INFO] " + evaluate() + info);
        writer.flush();
    }

    @Override
    public void info(short info) {
        writer.println(LocalDateTime.now().toString() + "[INFO] " + evaluate() + info);
        writer.flush();
    }

    @Override
    public void info(byte info) {
        writer.println(LocalDateTime.now().toString() + "[INFO] " + evaluate() + info);
        writer.flush();
    }

    /**
     * Log debug message.
     *
     * @param debug message to log
     */
    public void debug(String debug) {
        writer.println(LocalDateTime.now().toString() + "[DEBUG]" + evaluate() + debug);
        writer.flush();
    }

    @Override
    public void debug(char debug) {
        writer.println(LocalDateTime.now().toString() + "[DEBUG] " + evaluate() + debug);
        writer.flush();
    }

    @Override
    public void debug(int debug) {
        writer.println(LocalDateTime.now().toString() + "[DEBUG] " + evaluate() + debug);
        writer.flush();
    }

    @Override
    public void debug(double debug) {
        writer.println(LocalDateTime.now().toString() + "[DEBUG] " + evaluate() + debug);
        writer.flush();
    }

    @Override
    public void debug(Object debug) {
        writer.println(LocalDateTime.now().toString() + "[DEBUG] " + evaluate() + debug.toString());
        writer.flush();
    }

    @Override
    public void debug(float debug) {
        writer.println(LocalDateTime.now().toString() + "[DEBUG] " + evaluate() + debug);
        writer.flush();
    }

    @Override
    public void debug(Object[] debugArray) {
        writer.println(LocalDateTime.now().toString() + "[DEBUG] " + evaluate() + Arrays.toString(debugArray));
        writer.flush();
    }

    @Override
    public void debug(boolean debug) {
        writer.println(LocalDateTime.now().toString() + "[DEBUG] " + evaluate() + debug);
        writer.flush();
    }

    @Override
    public void debug(long debug) {
        writer.println(LocalDateTime.now().toString() + "[DEBUG] " + evaluate() + debug);
        writer.flush();
    }

    @Override
    public void debug(short debug) {
        writer.println(LocalDateTime.now().toString() + "[DEBUG] " + evaluate() + debug);
        writer.flush();
    }

    @Override
    public void debug(byte debug) {
        writer.println(LocalDateTime.now().toString() + "[DEBUG] " + evaluate() + debug);
        writer.flush();
    }

    /**
     * Log warn message.
     *
     * @param warn message to log
     */
    public void warn(String warn) {
        writer.println(LocalDateTime.now().toString() + "[WARNING]" + evaluate() + warn);
        writer.flush();
    }

    @Override
    public void warn(char warn) {
        writer.println(LocalDateTime.now().toString() + "[WARNING] " + evaluate() + warn);
        writer.flush();
    }

    @Override
    public void warn(int warn) {
        writer.println(LocalDateTime.now().toString() + "[WARNING] " + evaluate() + warn);
        writer.flush();
    }

    @Override
    public void warn(double warn) {
        writer.println(LocalDateTime.now().toString() + "[WARNING] " + evaluate() + warn);
        writer.flush();
    }

    @Override
    public void warn(Object warn) {
        writer.println(LocalDateTime.now().toString() + "[WARNING] " + evaluate() + warn.toString());
        writer.flush();
    }

    @Override
    public void warn(float warn) {
        writer.println(LocalDateTime.now().toString() + "[WARNING] " + evaluate() + warn);
        writer.flush();
    }

    @Override
    public void warn(Object[] warnArray) {
        writer.println(LocalDateTime.now().toString() + "[WARNING] " + evaluate() + Arrays.toString(warnArray));
        writer.flush();
    }

    @Override
    public void warn(boolean warn) {
        writer.println(LocalDateTime.now().toString() + "[WARNING] " + evaluate() + warn);
        writer.flush();
    }

    @Override
    public void warn(long warn) {
        writer.println(LocalDateTime.now().toString() + "[WARNING] " + evaluate() + warn);
        writer.flush();
    }

    @Override
    public void warn(short warn) {
        writer.println(LocalDateTime.now().toString() + "[WARNING] " + evaluate() + warn);
        writer.flush();
    }

    @Override
    public void warn(byte warn) {
        writer.println(LocalDateTime.now().toString() + "[WARNING] " + evaluate() + warn);
        writer.flush();
    }

    /**
     * Log error message.
     *
     * @param error message to log
     */
    public void error(String error) {
        writer.println(LocalDateTime.now().toString() + "[ERROR]" + evaluate() + error);
        writer.flush();
    }

    @Override
    public void error(char error) {
        writer.println(LocalDateTime.now().toString() + "[ERROR] " + evaluate() + error);
        writer.flush();
    }

    @Override
    public void error(int error) {
        writer.println(LocalDateTime.now().toString() + "[ERROR] " + evaluate() + error);
        writer.flush();
    }

    @Override
    public void error(double error) {
        writer.println(LocalDateTime.now().toString() + "[ERROR] " + evaluate() + error);
        writer.flush();
    }

    @Override
    public void error(Object error) {
        writer.println(LocalDateTime.now().toString() + "[ERROR] " + evaluate() + error.toString());
        writer.flush();
    }

    @Override
    public void error(float error) {
        writer.println(LocalDateTime.now().toString() + "[ERROR] " + evaluate() + error);
        writer.flush();
    }

    @Override
    public void error(Object[] errorArray) {
        writer.println(LocalDateTime.now().toString() + "[ERROR] " + evaluate() + Arrays.toString(errorArray));
        writer.flush();
    }

    @Override
    public void error(boolean error) {
        writer.println(LocalDateTime.now().toString() + "[ERROR] " + evaluate() + error);
        writer.flush();
    }

    @Override
    public void error(long error) {
        writer.println(LocalDateTime.now().toString() + "[ERROR] " + evaluate() + error);
        writer.flush();
    }

    @Override
    public void error(short error) {
        writer.println(LocalDateTime.now().toString() + "[ERROR] " + evaluate() + error);
        writer.flush();
    }

    @Override
    public void error(byte error) {
        writer.println(LocalDateTime.now().toString() + "[ERROR] " + evaluate() + error);
        writer.flush();
    }

    /**
     * Log fatal error message.
     *
     * @param fatal message to log
     */
    public void fatal(String fatal) {
        writer.println(LocalDateTime.now().toString() + "[FATAL]" + evaluate() + fatal);
        writer.flush();
    }

    @Override
    public void fatal(char fatal) {
        writer.println(LocalDateTime.now().toString() + "[FATAL] " + evaluate() + fatal);
        writer.flush();
    }

    @Override
    public void fatal(int fatal) {
        writer.println(LocalDateTime.now().toString() + "[FATAL] " + evaluate() + fatal);
        writer.flush();
    }

    @Override
    public void fatal(double fatal) {
        writer.println(LocalDateTime.now().toString() + "[FATAL] " + evaluate() + fatal);
        writer.flush();
    }

    @Override
    public void fatal(Object fatal) {
        writer.println(LocalDateTime.now().toString() + "[FATAL] " + evaluate() + fatal.toString());
        writer.flush();
    }

    @Override
    public void fatal(float fatal) {
        writer.println(LocalDateTime.now().toString() + "[FATAL] " + evaluate() + fatal);
        writer.flush();
    }

    @Override
    public void fatal(Object[] fatalArray) {
        writer.println(LocalDateTime.now().toString() + "[FATAL] " + evaluate() + Arrays.toString(fatalArray));
        writer.flush();
    }

    @Override
    public void fatal(boolean fatal) {
        writer.println(LocalDateTime.now().toString() + "[FATAL] " + evaluate() + fatal);
        writer.flush();
    }

    @Override
    public void fatal(long fatal) {
        writer.println(LocalDateTime.now().toString() + "[FATAL] " + evaluate() + fatal);
        writer.flush();
    }

    @Override
    public void fatal(short fatal) {
        writer.println(LocalDateTime.now().toString() + "[FATAL] " + evaluate() + fatal);
        writer.flush();
    }

    @Override
    public void fatal(byte fatal) {
        writer.println(LocalDateTime.now().toString() + "[FATAL] " + evaluate() + fatal);
        writer.flush();
    }


    /**
     * Closes all streams.
     */
    @Override
    public void closeStreams() {
        writer.flush();
        writer.close();
    }
}
