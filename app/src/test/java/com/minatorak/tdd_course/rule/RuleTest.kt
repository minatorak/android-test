package com.minatorak.tdd_course.rule

import org.junit.Rule
import org.junit.Test
import org.junit.rules.Timeout
import java.util.concurrent.TimeoutException

class RuleTest {

    @Rule @JvmField
    var timeout: Timeout = Timeout.seconds(2)

    @Test
    fun testA() {
        for (i in 1..500){
            print(i)
        }
    }


    @Test(expected = TimeoutException::class)
    fun testB() {
        while (true){
        }
    }


    @Test
    fun testC() {

    }
}
