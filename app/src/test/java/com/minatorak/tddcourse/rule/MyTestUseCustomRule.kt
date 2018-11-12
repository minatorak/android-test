package com.minatorak.tddcourse.rule

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