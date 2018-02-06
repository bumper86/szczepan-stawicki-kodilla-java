package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatortestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(3.0, 7.0);
        double resultSub = calculator.sub(4.0, 1.0);
        double resultMul = calculator.mul(3.0, 4.0);
        double resultDiv = calculator.div(10.0, 2.0);
        //Then
        Assert.assertEquals(10.0, resultAdd, 0);
        Assert.assertEquals(3.0, resultSub,0);
        Assert.assertEquals(12.0, resultMul,0);
        Assert.assertEquals(5.0, resultDiv,0);
    }
}
