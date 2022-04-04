package com.aplicativo.espressotutorial.pageobject

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import com.aplicativo.espressotutorial.R
import com.aplicativo.espressotutorial.util.SleepTimer
import org.hamcrest.Matchers

object TabLayoutScreen {

    private val VIEWPAGER : ViewInteraction = onView(withId(R.id.viewPager))
    private val TABCALENDARIO : ViewInteraction = onView(Matchers.allOf(withText("CALENDÁRIO"),
        isDescendantOfA(withId(R.id.tabLayout))))
    private val TABCONTAS : ViewInteraction = onView(Matchers.allOf(withText("CONTAS"),
        isDescendantOfA(withId(R.id.tabLayout))))

    val sleepTimer = SleepTimer()

    fun testeDeMudancaDeTab(){
        sleepTimer.sleep(3000)
        VIEWPAGER.perform(swipeLeft()) //Arrasta o viewPager para a esquerda
        sleepTimer.sleep(3000)
        VIEWPAGER.perform(swipeRight()) //Arrasta o viewPager para a direita


        sleepTimer.sleep(3000)
        TABCALENDARIO.perform(click()).check(matches(isDisplayed())) //Clica na tab com o nome determinado
        sleepTimer.sleep(3000)
        TABCONTAS.perform(click()).check(matches(isDisplayed()))

    }
}