package com.minatorak.tddcourse.Login

import com.minatorak.tddcourse.login.LoginPresenter
import com.minatorak.tddcourse.login.LoginView
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class LoginPresenterTest {

    private lateinit var mockView: LoginView
    private lateinit var loginPresenter: LoginPresenter
    private val usernameDummy: String = "Random"
    private val passwordDummy: String = "1234"

    private val wrongUsername: String = "Maria"
    private val wrongPassword: String = "PASSWORD"

    @Before
    fun setup() {
        mockView = mock(LoginView::class.java)
        loginPresenter = LoginPresenter(mockView)
    }

    @Test
    fun checkUserCanGoToTheMainScreenIfTheCredentialsAreCorrect() {
        loginPresenter.login(usernameDummy, passwordDummy)

        verify(mockView).gotoMainScreen()
    }

    @Test
    fun checkUserHaveErrorWrongCredential() {
        loginPresenter.login(wrongUsername, wrongPassword)
        verify(mockView).showErrorMsg()
    }

    @Test
    fun checkUserWillGetErrorMsgWhenWrongAccountOverTime() {
        loginPresenter.login(wrongUsername,wrongPassword)
        loginPresenter.login(wrongUsername,wrongPassword)
        loginPresenter.login(wrongUsername,wrongPassword)
        verify(mockView).showAttemptsErrorMsg()
    }

}
