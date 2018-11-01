package com.minatorak.tdd_course.parametric

import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.*

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

    companion object {

        @Parameterized.Parameters
        fun dataset(): Collection<Array<Any>> {
            val data = arrayOf(arrayOf<Any>(1, 2, 3), arrayOf<Any>(2, 5, 7), arrayOf<Any>(10, 5, 9))
            return Arrays.asList(*data)
        }

    }
}
