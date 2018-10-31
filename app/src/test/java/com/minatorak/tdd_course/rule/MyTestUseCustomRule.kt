package com.minatorak.tdd_course.rule

import org.junit.Rule
import org.junit.Test

class MyTestUseCustomRule {

    @Rule
    @JvmField
    var customRule: CustomRule = CustomRule()

    @Test
    fun testWarning() {
        customRule.getLogger()?.warning("very bad problem")
    }

}