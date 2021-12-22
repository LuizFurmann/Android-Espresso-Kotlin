package com.aplicativo.espressotutorial.tests

import org.junit.runner.RunWith
import org.junit.runners.Suite


@RunWith(Suite::class)
@Suite.SuiteClasses(
    LoginTest::class,
    DraweTest::class
)

class SuitTest