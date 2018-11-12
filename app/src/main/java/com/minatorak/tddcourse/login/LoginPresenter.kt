package com.minatorak.tddcourse.login

class LoginPresenter(private val viewActivity: LoginView) {

    private val usernameDummy: String = "Random"
    private val passwordDummy: String = "1234"
    private var attemptsCounter: Int = 1
    private val MAX_ATTEMPTS = 3

    fun login(username: String, password: String) {
        if (isAttemptsCount()) {
            viewActivity.showAttemptsErrorMsg()
            return
        }
        if (usernameDummy == username && passwordDummy == password) {
            viewActivity.gotoMainScreen()
        } else {
            incrementAttempts()
            viewActivity.showErrorMsg()
        }
    }

    private fun incrementAttempts() = attemptsCounter++

    private fun isAttemptsCount(): Boolean = attemptsCounter == MAX_ATTEMPTS

}