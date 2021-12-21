package com.aplicativo.espressotutorial.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.aplicativo.espressotutorial.pageobject.LoginScreen
import com.aplicativo.espressotutorial.view.LoginActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginTest {

    @get:Rule //responsavel por iniciar a primeira tela
    val loginActivity = ActivityScenarioRule(LoginActivity::class.java)

    val loginScreen = LoginScreen //instancia da classe dos objetos

    @Test
    fun loginTest() {

        loginScreen.loginAs("luizteste","jkfld59g")

    }
}
