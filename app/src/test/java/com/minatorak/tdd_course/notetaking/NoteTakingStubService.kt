package com.minatorak.tdd_course.notetaking

import com.minatorak.tddcourse.junitest.NoteTakingService

class NoteTakingStubService : NoteTakingService {

    override fun getAllBusinessNotes(): List<String> {
        return listOf("Android make", "Android is awesome", "I am Super")
    }

}