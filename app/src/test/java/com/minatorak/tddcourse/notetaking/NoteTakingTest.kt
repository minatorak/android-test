package com.minatorak.tddcourse.notetaking

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    NoteTakingTest.AddNoteText::class,
    NoteTakingTest.AddImageNote::class,
    NoteTakingTest.AddAudioNote::class
)
class NoteTakingTest {

    class AddNoteText {
        @Test
        fun testEmptyNote() {

        }

        @Test
        fun testMultilineText() {

        }
    }

    class AddImageNote {
        @Test
        fun testGifImage() {

        }

        @Test
        fun testVeryLargeImg() {

        }
    }

    class AddAudioNote {
        @Test
        fun testMp3Audio() {

        }
    }
}