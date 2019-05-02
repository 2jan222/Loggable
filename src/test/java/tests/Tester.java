package tests;

import com.github._2jan222.Loggerable;
import com.github._2jan222.annotations.LoggerableInjector;
import com.github._2jan222.loggers.SystemStreamLogger;
import com.github._2jan222.parser.LoggerInjector;
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
