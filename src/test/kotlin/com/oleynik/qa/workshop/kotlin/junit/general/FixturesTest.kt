package com.oleynik.qa.workshop.kotlin.junit.general

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class FixturesTest {

    companion object {
        private const val ACTUAL = "Actual string"
        private const val EXPECTED = "Actual string" // "Expected string"

        @JvmStatic
        @BeforeAll
        fun globalSetUp() {
            println("Set up class")
        }

        @JvmStatic
        @AfterAll
        fun globalTearDown() {
            println("Tear down class")
        }
    }

    @BeforeEach
    fun setUp() {
        println("Set up method")
    }

    @AfterEach
    fun tearDown() {
        println("Tear down method")
    }

    @Test
    fun `first test runs with lifecycle fixtures`() {
        assertEquals(EXPECTED, ACTUAL, "Wrong string found")
    }

    @Test
    fun `second test runs with lifecycle fixtures`() {
        assertEquals(ACTUAL, ACTUAL, "Wrong string found")
    }
}
