package com.minatorak.tdd_course.spytest

import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito

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

}