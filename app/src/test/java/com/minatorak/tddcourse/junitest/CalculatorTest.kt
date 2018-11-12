package com.minatorak.tddcourse.junitest;

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.lang.IllegalArgumentException


class CalculatorTest {
    private var calculator: Calculator? = null

    @Before
    fun setup() {
        calculator = Calculator()
        print("@Before")
    }

    @Test
    fun testAddingTwoPositiveNumbers() {
        assertEquals(50, calculator?.add(20, 30));
    }

    @Test
    fun testSubtractionPositiveNumbers() {
        assertEquals(10, calculator?.subtract(20, 10))
    }

    @Test
    fun testMultiplicationForTwoPositiveNumber() {
        assertEquals(300, calculator?.multiply(10, 30))
    }

    @Test
    fun testDivisionByNonZeroNumber() {
        assertEquals(3, calculator?.divide(15, 5))
    }

    @Test(expected = IllegalArgumentException::class)
    fun testDivisionByZeroNumber() {
        calculator?.divide(15, 0)
    }

    @After
    fun teardown() {
        calculator = null
        print("@After")
    }
}
