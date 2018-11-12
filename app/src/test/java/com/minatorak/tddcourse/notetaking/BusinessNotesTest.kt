package com.minatorak.tddcourse.notetaking

import com.minatorak.tddcourse.junitest.NoteTakingManager
import com.minatorak.tddcourse.junitest.NoteTakingService
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class BusinessNotesTest {

    @Test
    fun testRetrieveBusinessNotes() {
        val service = NoteTakingStubService()
        val manager = NoteTakingManager(service)
        assertEquals(2, manager.getAllBusinessNotes().size)
    }

    @Test
    fun mockitoRetrieveBusinessNotes() {
        val service: NoteTakingService = mock(NoteTakingService::class.java)
        val data = listOf("Android make", "Android is awesome", "I am Super")
        `when`(service.getAllBusinessNotes()).thenReturn(data)

        val manager = NoteTakingManager(service)
        assertEquals(2,manager.getAllBusinessNotes().size)
    }
}