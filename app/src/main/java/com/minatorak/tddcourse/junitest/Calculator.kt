package com.minatorak.tddcourse.junitest

import java.lang.IllegalArgumentException

class Calculator {

    fun add(a: Int, b: Int): Int {
        return a+b
    }

    fun subtract(a: Int, b: Int): Int {
        return a-b
    }

    fun multiply(a: Int, b: Int): Int {
        return a*b
    }

    fun divide(a: Int, b: Int): Int {
        if (b == 0) throw IllegalArgumentException("This can not be zero number")
        return a/b
    }

}
