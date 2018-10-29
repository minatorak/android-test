package com.minatorak.tdd_course.junitest;

import junit.framework.Assert.assertEquals
import org.junit.Test


class CalculatorTest {

    @Test
    private fun testAddingTwoPositiveNumbers() {
        val calculator = Calculator()
        assertEquals(50,calculator.add(20,30));
    }

    @Test
    private fun testSubtractionPositiveNumbers() {
        val calculator =Calculator()
        assertEquals(10,calculator.subtract(20,10))
    }
}
