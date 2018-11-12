package com.minatorak.tddcourse.mockito

import org.junit.Test
import org.mockito.Mockito.mock

class MockingStaticTest{
    @Test
    fun testPerson() {
        var person = mock(Person::class.java)
    }
}