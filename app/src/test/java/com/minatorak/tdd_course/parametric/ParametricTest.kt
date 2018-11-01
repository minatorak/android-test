package com.minatorak.tdd_course.parametric

import com.minatorak.tddcourse.junitest.Calculator
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.*

@RunWith(Parameterized::class)
class ParametricTest {

    private var numberA: Int = 1
    private var numberB: Int = 2
    private var expected: Int = 3

    constructor(a: Int, b: Int, expect: Int) {
        numberA = a
        numberB = b
        expected = expect
    }

    companion object {

        @Parameterized.Parameters
        fun dataset(): Collection<Array<Any>> {
            val data = arrayOf(arrayOf<Any>(1, 2, 3), arrayOf<Any>(2, 5, 7), arrayOf<Any>(10, 5, 9))
            return Arrays.asList(*data)
        }
    }

    @Test
    fun testAddingTwoPositiveNumber() {
        val calculator = Calculator()
        assertEquals(expected,calculator.add(numberA,numberB))
    }
}
