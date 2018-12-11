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
public class CalculatorTestSuite {
    @Test
    public void testAddition(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double val = calculator.add(3.0,3.0);

        Assert.assertEquals(6.0,val,0.0);
    }
    @Test
    public void testSubstraction(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double val = calculator.sub(3.0,3.0);

        Assert.assertEquals(0.0,val,0.0);
    }
    @Test
    public void testDivision(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double val = calculator.div(3.0,3.0);

        Assert.assertEquals(1.0,val,0.0);
    }
    @Test
    public void testMultiplication(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double val = calculator.mul(3.0,3.0);

        Assert.assertEquals(9.0,val,0.0);
    }
}
