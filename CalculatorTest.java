package com.barclays;

import static org.junit.Assert.*;

import org.junit.Test;
import com.barclays.Calculator;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void calculatSum()
    {
        Calculator calculator = new Calculator();
        int result = calculator.sum(34,34);
        assertEquals(68, result);
    }
}
