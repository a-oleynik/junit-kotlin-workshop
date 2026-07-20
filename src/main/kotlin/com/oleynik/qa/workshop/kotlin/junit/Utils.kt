package com.oleynik.qa.workshop.kotlin.junit

import java.util.concurrent.TimeUnit

object Utils {

    fun waitFor(timeoutInSeconds: Long) {
        try {
            TimeUnit.SECONDS.sleep(timeoutInSeconds)
        } catch (exception: InterruptedException) {
            throw RuntimeException(exception)
        }
    }
}
