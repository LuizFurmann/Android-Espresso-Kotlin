package com.aplicativo.espressotutorial.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.aplicativo.espressotutorial.pageobject.DraweScreen
import com.aplicativo.espressotutorial.view.HomeActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DraweTest {

    @get:Rule //responsavel por fazer a primeira abertura da tela
    val homeActivity = ActivityScenarioRule(HomeActivity::class.java)

    val draweScreen = DraweScreen

    @Test
    fun draweTest() {
        draweScreen.draweAction()
    }
}
