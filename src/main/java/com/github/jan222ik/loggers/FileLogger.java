package com.github.jan222ik.loggers;

import com.github.jan222ik.exceptions.LoggerableException;
import org.jetbrains.annotations.Contract;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;

/**
 * Logger, which writes to a PrintWriter.
 */
public class FileLogger extends AbstractLogger {

    private PrintWriter writer;

    @Contract("null -> fail")
    public FileLogger(PrintWriter writer) {
        this.writer = writer;
        if (writer == null) {
            throw new LoggerableException("PrintWriter must be @NotNull");
        }
    }

    @Contract("null -> fail")
    public FileLogger(File file) throws FileNotFoundException, UnsupportedEncodingException {
        this(new PrintWriter(file, "UTF-8"));
    }

    @Contract("null, _, !null -> fail; !null, _, null -> fail")
    public FileLogger(File file, boolean createMissing, String charSet) throws IOException {
        if (createMissing) {
            //noinspection ResultOfMethodCallIgnored
            file.getParentFile().mkdirs();
            //noinspection ResultOfMethodCallIgnored
            file.createNewFile();
        }
        this.writer = new PrintWriter(file, charSet);
    }

    @Override
    public void info(String info) {
        if (visibility[0]) {
            writeFile(INFO, info);
        }
    }

    @Override
    public void debug(String debug) {
        if (visibility[1]) {
            writeFile(DEBUG, debug);
        }
    }

    @Override
    public void warn(String warn) {
        if (visibility[2]) {
            writeFile(WARN, warn);
        }
    }

    @Override
    public void error(String error) {
        if (visibility[3]) {
            writeFile(ERROR, error);
        }
    }

    @Override
    public void fatal(String fatal) {
        if (visibility[4]) {
            writeFile(FATAL, fatal);
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

    private void writeFile(String typeString, String message) {
        writer.println(LocalDateTime.now().toString() + typeString + evaluate() + message);
        writer.flush();
    }
}
