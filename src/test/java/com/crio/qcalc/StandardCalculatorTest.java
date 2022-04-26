package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }
    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation(){
        standardCalculator.add(1,1);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Integers")
    void testSubtractionOperation(){
        standardCalculator.substract(4 , 2);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("Test multiplication of two integers")
    void testMultiplicationOperation(){
        standardCalculator.multiply(2,6);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(12,actualResult);
    }

    @Test
    @DisplayName("Test division of two integers")
    void testDivisionOperation(){
        standardCalculator.divide(28, 4);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(7,actualResult);
    }
}
