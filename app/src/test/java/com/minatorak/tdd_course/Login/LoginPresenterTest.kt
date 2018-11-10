package com.minatorak.tdd_course.Login

import com.minatorak.tddcourse.login.LoginPresenter
import com.minatorak.tddcourse.login.LoginView
import org.junit.Test
import org.mockito.Mockito.mock

class LoginPresenterTest {

    val USERNAME_DUMMY: String = "Random"
    val PASSWORD_DUMMY: String = "1234"

    @Test
    fun checkUserCanGoToTheMainScreenIfTheCredentialsAreCorrect() {
        val mockView: LoginView = mock(LoginView::class.java)
        val loginPresenter = LoginPresenter(mockView)
    }

}