package com.aplicativo.espressotutorial.util

class SleepTimer {

    fun sleep(millis: Long){
        try {
            Thread.sleep(millis) //timer
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}