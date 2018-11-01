package com.minatorak.tdd_course.mockito

import com.minatorak.tddcourse.mockito.Person
import org.junit.Before
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class AnnotationMockingTest {

    @Mock
    private lateinit var person: Person

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
    }
}