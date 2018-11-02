package com.minatorak.tdd_course.notetaking

import com.minatorak.tddcourse.junitest.NoteTakingManager
import junit.framework.TestCase.assertEquals
import org.junit.Test

class BusinessNotesTest {
    @Test
    fun testRetrieveBusinessNotes() {
        val service = NoteTakingStubService()
        val manager = NoteTakingManager(service)
        assertEquals(2, manager.getAllBusinessNotes()?.size)
    }
}