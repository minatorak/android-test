package com.minatorak.tddcourse.spytest

import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.`when`

class SpyListTest {

    @Test
    fun testSpyArrayList() {
        val originalList: MutableList<String> = mutableListOf()
        val spyList = Mockito.spy(originalList)

        spyList.add("Python Programming")
        spyList.add("Kotlin Programming")

        Mockito.verify(spyList).add("Python Programming")
        Mockito.verify(spyList).add("Kotlin Programming")

        Assert.assertEquals(2, spyList.size)
    }

    @Test
    fun testSpyStub() {
        val originalList: MutableList<String> = mutableListOf()
        val spyList = Mockito.spy(originalList)

        Assert.assertEquals(0,spyList.size)

        // stub
        `when`(spyList.size).thenReturn(20)

        Assert.assertEquals(20,spyList.size)
    }
}