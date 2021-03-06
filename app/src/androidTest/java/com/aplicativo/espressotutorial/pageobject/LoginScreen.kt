package com.aplicativo.espressotutorial.pageobject

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.aplicativo.espressotutorial.R
import com.aplicativo.espressotutorial.util.SleepTimer

object LoginScreen {

    private val USERNAME_EDIT: ViewInteraction = onView(withId(R.id.usernameInput))
    private val PASSWORD_EDIT: ViewInteraction = onView(withId(R.id.passwordInput))
    private val LOGIN_BUTTON: ViewInteraction = onView(withId(R.id.btn_login))
    private val HOME_TXT: ViewInteraction = onView(withText("App Home"))

    val sleepTimer = SleepTimer()

    private fun enterUserName(username: String) {
        USERNAME_EDIT.perform(ViewActions.typeText(username))
    }

    private fun enterPassword(password: String) {
        PASSWORD_EDIT.perform(ViewActions.typeText(password), ViewActions.closeSoftKeyboard())
    }

    private fun clickLogin() {
        LOGIN_BUTTON.perform(ViewActions.click())
    }

    private fun checkTxtHome() {
        HOME_TXT.check(matches(isDisplayed()))
    }

    fun loginAs(username: String, password: String) { // digita nos campos e faz o login
        enterUserName(username)
        enterPassword(password)
        sleepTimer.sleep(2000)
        clickLogin()
        checkTxtHome()
    }
}
