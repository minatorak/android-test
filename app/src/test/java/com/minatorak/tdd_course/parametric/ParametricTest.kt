package com.minatorak.tdd_course.parametric

import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class ParametricTest {
    private var numberA: Int? = null
    private var numberB: Int? = null
    private var expected: Int? = null

    fun ParametricTest(a: Int, b: Int, expect: Int) {
        numberA = a
        numberB = b
        expected = expect
    }
}