package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void giveLog() {
        Logger.getInstance().log("bumper");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("bumper", result);
    }
}
