package com.minatorak.tddcourse.junitest

import java.lang.IllegalArgumentException

class Calculator {

    fun add(i: Int, i1: Int): Int {
        return i+i1
    }

    fun subtract(i: Int, i1: Int): Int {
        return i-i1
    }

    fun multiply(i: Int, i1: Int): Int {
        return i*i1
    }

    fun divide(i: Int, i1: Int): Int {
        if (i1 == 0) throw IllegalArgumentException("This can not be zero number")
        return i/i1
    }

}
