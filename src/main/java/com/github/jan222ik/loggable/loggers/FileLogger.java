package com.github.jan222ik.loggable.loggers;

import com.github.jan222ik.loggable.LoggerColor;
import com.github.jan222ik.loggable.exceptions.LoggerableException;

import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 * @author Janik Mayr on 27.10.2018
 */
public class FileLogger extends AbstractLogger{

    private PrintWriter writer;

    private FileLogger() {}

    public FileLogger(PrintWriter writer) {
        this.writer = writer;
        if (writer == null) throw new LoggerableException("PrintWriter resulted in NPE");
    }

    /**
     * Log info message.
     * @param info message to log
     */
    public void info(String info, LoggerColor... color) {
        if (visibility[0]) {
            writer.println(LocalDateTime.now().toString() + " [INFO] " + evaluate() + info);
            writer.flush();
        }
    }

    /**
     * Log debug message.
     * @param debug message to log
     */
    public void debug(String debug, LoggerColor... color) {
        if (visibility[1]) {
            writer.println(LocalDateTime.now().toString() + " [DEBUG]"+ evaluate() + debug);
            writer.flush();
        }
    }

    /**
     * Log warn message.
     * @param warn message to log
     */
    public void warn(String warn, LoggerColor... color) {
        if (visibility[2]) {
            writer.println(LocalDateTime.now().toString() + " [WARNING]"+ evaluate() + warn);
            writer.flush();
        }
    }

    /**
     * Log error message.
     * @param error message to log
     */
    public void error(String error, LoggerColor... color) {
        if (visibility[3]) {
            writer.println(LocalDateTime.now().toString() + " [ERROR]" + evaluate() + error);
            writer.flush();
        }
    }

    /**
     * Log fatal error message.
     * @param fatal message to log
     */
    public void fatal(String fatal, LoggerColor... color) {
        if (visibility[4]) {
            writer.println(LocalDateTime.now().toString() + " [FATAL]"+ evaluate() + fatal);
            writer.flush();
        }
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
