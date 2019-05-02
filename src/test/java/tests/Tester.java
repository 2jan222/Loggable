package tests;

import com.github.jan222ik.Loggerable;
import com.github.jan222ik.annotations.LoggerableInjector;
import com.github.jan222ik.loggers.SystemStreamLogger;
import com.github.jan222ik.parser.LoggerInjector;
import org.junit.jupiter.api.Test;


class Tester {
    @LoggerableInjector private Loggerable logger;
    @Test
    void test(){
        Loggerable log = new SystemStreamLogger();
        LoggerInjector injector = new LoggerInjector(log,"tests");

        //Assertions.assertEquals(log,logger);
    }
}
