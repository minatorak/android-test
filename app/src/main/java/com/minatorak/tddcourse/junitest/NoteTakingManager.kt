package com.minatorak.tddcourse.junitest

class NoteTakingManager(var service: NoteTakingService) {

    fun getAllBusinessNotes(): List<String>? {
        return listOf("Note 1","Note 2")
    }


}