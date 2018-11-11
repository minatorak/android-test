package com.minatorak.tdd_course.Login

import com.minatorak.tddcourse.login.LoginPresenter
import com.minatorak.tddcourse.login.LoginView
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class LoginPresenterTest {

    private val usernameDummy: String = "Random"
    private val passwordDummy: String = "1234"

    @Test
    fun checkUserCanGoToTheMainScreenIfTheCredentialsAreCorrect() {
        val mockView: LoginView = mock(LoginView::class.java)
        val loginPresenter = LoginPresenter(mockView)
        loginPresenter.login(usernameDummy,passwordDummy)

        verify(mockView).gotoMainScreen()
    }

}
