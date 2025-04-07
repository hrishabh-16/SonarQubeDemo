package com.trivium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/* This is a unit  test code for the Calculator class */
 class CalculatorTest {

    Calculator calc = new Calculator();

//    @Test
//     void testAdd() {
//        assertEquals(5, calc.add(2, 3));
//      
//    }
//
//    @Test
//     void testSub() {
//        assertEquals(1, calc.sub(3, 2));
//
//    }
//    @Test
//     void testMultiply() {
//        assertEquals(6, calc.multiply(2, 3));
//        
//    }

    @Test
     void testDivide() {
        assertEquals(2, calc.divide(6, 3));
        
    }
}
