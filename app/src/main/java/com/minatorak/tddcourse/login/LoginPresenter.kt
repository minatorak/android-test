package com.minatorak.tddcourse.login

class LoginPresenter(private val viewActivity: LoginView) {

    private val usernameDummy: String = "Random"
    private val passwordDummy: String = "1234"

    fun login(username: String, password: String) {
        if (usernameDummy == username && passwordDummy == password) {
            viewActivity.gotoMainScreen()
        }
        else {
            viewActivity.showErrorMsg()
        }
    }

}