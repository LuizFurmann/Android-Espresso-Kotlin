package com.aplicativo.espressotutorial.tests

import org.junit.runner.RunWith
import org.junit.runners.Suite


@RunWith(Suite::class)
@Suite.SuiteClasses( //Executa todos os testes adicionados ao suite, na sequência adicionada
    LoginTest::class,
    DraweTest::class,
    TabLayoutTest::class
)

class SuitTest