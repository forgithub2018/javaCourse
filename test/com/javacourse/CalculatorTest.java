package com.javacourse;

import org.junit.Test;
import static org.junit.Assert.*;

import com.javacourse.Calculator.Calculator;


public class CalculatorTest {
    @Test
    public void testSum() {
        // prepare
        Calculator calculator = new Calculator();
        int expected = 25;

        // when
        int actual = calculator.sum(10, 15);

        // then
        assertEquals(expected, actual);
        // }
    }
}
