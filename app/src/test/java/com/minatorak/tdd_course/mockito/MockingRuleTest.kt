package com.minatorak.tdd_course.mockito

import com.minatorak.tddcourse.mockito.Person
import org.junit.Rule
import org.mockito.Mock
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoRule

class MockingRuleTest {
    @Rule
    var rule:MockitoRule = MockitoJUnit.rule()

    @Mock
    lateinit var  person: Person

}