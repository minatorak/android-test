package com.minatorak.tddcourse.junitest;

import junit.framework.TestCase.assertEquals
import org.junit.Test


class CalculatorTest {

    @Test
    fun testAddingTwoPositiveNumbers() {
        val calculator = Calculator()
        assertEquals(50,calculator.add(20,30));
    }

    @Test
    fun testSubtractionPositiveNumbers() {
        val calculator =Calculator()
        assertEquals(10,calculator.subtract(20,10))
    }

    @Test
    fun testMultiplicationForTwoPositiveNumber(){
        val calculator = Calculator()
        assertEquals(300,calculator.multiply(10,30))
    }
}
