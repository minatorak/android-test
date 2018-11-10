package com.minatorak.tdd_course.Login

import com.minatorak.tddcourse.login.LoginPresenter
import com.minatorak.tddcourse.login.LoginView
import org.junit.Test
import org.mockito.Mockito.mock

class LoginPresenterTest {
    @Test
    fun checkUserCanGoToTheMainScreenIfTheCredentialsAreCorrect() {
        val mockView = mock(LoginView::class.java)
        val loginPresenter = LoginPresenter(mockView)
    }

}