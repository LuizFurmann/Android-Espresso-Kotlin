package com.aplicativo.espressotutorial.pageobject

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.aplicativo.espressotutorial.R
import com.aplicativo.espressotutorial.util.SleepTimer

object DraweScreen {

    private val OPEN_DRAWE : ViewInteraction = Espresso.onView(withContentDescription(R.string.open))
    private val NAV_VIEW: ViewInteraction = Espresso.onView(withId(R.id.nav_view))
    private val NAV_HOME: ViewInteraction = Espresso.onView(withId(R.id.nav_home))
    private val NAV_LEAD: ViewInteraction = Espresso.onView(withId(R.id.nav_lead))
    private val NAV_SYNC: ViewInteraction = Espresso.onView(withId(R.id.nav_sync))
    private val NAV_LAGOUT: ViewInteraction = Espresso.onView(withId(R.id.nav_logout))

    val sleepTimer = SleepTimer()

    fun openNavView() { //clica no drawe para abrir
        OPEN_DRAWE.perform(ViewActions.click())
    }

    private fun checkNavView() { //verifica se o nav_header está visivel
        NAV_VIEW.check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    private fun clickHomeOption() {
        NAV_HOME.perform(ViewActions.click())
    }

    fun clickLeadOption() {
        NAV_LEAD.perform(ViewActions.click())
        sleepTimer.sleep(3000)
    }

    private fun clickSyncOption() {
        NAV_SYNC.perform(ViewActions.click())
    }

    private fun clickLogoutOption() {
        NAV_LAGOUT.perform(ViewActions.click())
    }

    fun draweAction() {
        openNavView()
        checkNavView()
        clickHomeOption()
        sleepTimer.sleep(2000)
        clickLeadOption()
        sleepTimer.sleep(2000)
        Espresso.pressBack()
        clickSyncOption()
        sleepTimer.sleep(2000)
        clickLogoutOption()
        sleepTimer.sleep(2000)
    }
}
