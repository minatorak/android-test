package com.minatorak.tddcourse.mockito

import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MockitoJunitRunnerTest {

    @Mock
    private lateinit var person: Person

}
