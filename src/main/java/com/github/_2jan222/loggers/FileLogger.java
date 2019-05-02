package com.github._2jan222.loggers;

import com.github._2jan222.exceptions.LoggerableException;

import java.io.PrintWriter;
import java.time.LocalDateTime;

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

    /**
     * Log debug message.
     *
     * @param debug message to log
     */
    public void debug(String debug) {
        writer.println(LocalDateTime.now().toString() + "[DEBUG]" + evaluate() + debug);
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

    /**
     * Log error message.
     *
     * @param error message to log
     */
    public void error(String error) {
        writer.println(LocalDateTime.now().toString() + "[ERROR]" + evaluate() + error);
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

    private void printFATAL(Object fatal) {
        writer.println(LocalDateTime.now().toString() + "[FATAL]" + evaluate() + fatal.toString());
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
