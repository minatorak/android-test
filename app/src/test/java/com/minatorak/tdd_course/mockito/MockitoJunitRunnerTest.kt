package com.minatorak.tdd_course.mockito

import com.minatorak.tddcourse.mockito.Person
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MockitoJunitRunnerTest {

    @Mock
    private lateinit var person: Person

}
