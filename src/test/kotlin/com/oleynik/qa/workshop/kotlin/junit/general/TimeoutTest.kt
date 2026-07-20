package com.oleynik.qa.workshop.kotlin.junit.general

import com.oleynik.qa.workshop.kotlin.junit.Utils
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertTimeout
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout
import java.time.Duration.ofSeconds

class TimeoutTest {

    @BeforeEach
    fun setUp() {
        Utils.waitFor(1)
        println("Set up")
        println("Set up thread id ${Thread.currentThread().threadId()}")
    }

    @AfterEach
    fun tearDown() {
        Utils.waitFor(1)
        println("Tear down")
        println("Tear down thread id ${Thread.currentThread().threadId()}")
    }

    @Test
    fun `assertTimeout completes when execution stays within six seconds`() {
        println("Timeout test")
        println("Thread id ${Thread.currentThread().threadId()}")
        assertTimeout(ofSeconds(6)) {
            Utils.waitFor(2)
        }
    }

    @Test
    fun `assertTimeout completes when execution stays within two seconds`() {
        println("Timeout test")
        println("Thread id ${Thread.currentThread().threadId()}")
        assertTimeout(ofSeconds(2)) {
            Utils.waitFor(1) // 2
        }
    }

    @Timeout(2)
    @Test
    fun `Timeout allows test to finish within two seconds`() {
        println("Timeout test")
        println("Thread id ${Thread.currentThread().threadId()}")
        Utils.waitFor(1) // 2
    }
}
