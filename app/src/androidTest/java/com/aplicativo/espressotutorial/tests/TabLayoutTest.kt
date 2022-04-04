package com.aplicativo.espressotutorial.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.aplicativo.espressotutorial.pageobject.TabLayoutScreen
import com.aplicativo.espressotutorial.util.SleepTimer
import com.aplicativo.espressotutorial.view.TabLayoutActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TabLayoutTest {

    @get:Rule
    val tabLayoutTest = ActivityScenarioRule(TabLayoutActivity::class.java)
    val tabScreen = TabLayoutScreen

    @Test
    fun tabTest(){
        tabScreen.testeDeMudancaDeTab() //Arrasta o viewPager para a esquesda
    }

}