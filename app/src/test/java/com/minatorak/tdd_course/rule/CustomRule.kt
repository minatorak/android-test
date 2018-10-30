package com.minatorak.tdd_course.rule

import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement
import java.util.logging.Logger

class CustomRule : TestRule {

    @JvmField
    var logger: Logger? = null

    fun getLogger(): Logger? {
        return logger
    }

    override fun apply(base: Statement?, description: Description?): Statement? {

        logger = Logger.getLogger(CustomRule::class.java.simpleName + ": this is my custom rule")
        return null
    }

}