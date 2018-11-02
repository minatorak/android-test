package com.minatorak.tddcourse.junitest

class NoteTakingManager(private var service: NoteTakingService) {

    fun getAllBusinessNotes(): List<String>? {
        val filter = mutableListOf<String>()
        val allNote = service.getAllBusinessNotes()

        for (note in allNote) {
            if (note.contains("Android")) {
                filter.add(note)
            }
        }

        return filter
    }



}