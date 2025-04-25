package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSumIntegers() {
        double result = Calculadora.sum(1, 2, 3, 4, 5);
        assertEquals(15.0, result, 0.0001); // Using delta for double comparison
    }

    @Test
    public void testSumDoubles() {
        double result = Calculadora.sum(1.5, 2.5, 3.5);
        assertEquals(7.5, result, 0.0001);
    }

    @Test
    public void testSumMixed() {
        double result = Calculadora.sum(1, 2.5, 3, 4.5);
        assertEquals(11.0, result, 0.0001);
    }

    @Test
    public void testSumEmpty() {
        double result = Calculadora.sum();
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testSumNull() {
        double result = Calculadora.sum((Integer[]) null);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testSumSingleValue(){
        double result = Calculadora.sum(5.0);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testSumNegativeNumbers() {
        double result = Calculadora.sum(-1.0, -2.0, -3.0);
        assertEquals(-6.0, result, 0.0001);
    }

    @Test
    public void testSumLargeNumbers() {
        double result = Calculadora.sum(Double.MAX_VALUE/2, Double.MAX_VALUE/2);
        assertEquals(Double.MAX_VALUE, result, 0.0001);
    }
}