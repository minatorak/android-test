package com.minatorak.tdd_course.mockito

import com.minatorak.tddcourse.mockito.Person
import org.junit.Test
import org.mockito.Mockito.mock

class MockingStaticTest{
    @Test
    fun testPerson() {
        var person = mock(Person::class.java)
    }
}