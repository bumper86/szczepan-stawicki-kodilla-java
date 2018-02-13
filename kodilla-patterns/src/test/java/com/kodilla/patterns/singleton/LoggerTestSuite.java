package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void giveLog() {
        logger = new Logger();
        logger.log("bumper");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String result = logger.getLastLog();
        //Then
        Assert.assertEquals("bumper", result);
    }
}
