package com.oleynik.qa.workshop.kotlin.junit.general

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertInstanceOf
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.fail
import org.junit.jupiter.api.Test

class ExceptionTest {

    // The preferred way to assert exceptions in modern JUnit.
    @Test
    fun `assertThrows captures expected exception`() {
        val thrown = assertThrows(IndexOutOfBoundsException::class.java) {
            ArrayList<String>()[0]
        }

        assertEquals("Index 0 out of bounds for length 0", thrown.message)
        assertTrue(thrown.message?.contains("Index 0") == true)
        assertInstanceOf(IndexOutOfBoundsException::class.java, thrown)
    }

    // A direct but less reliable way to assert exceptions.
    @Test
    fun `try catch verifies exception directly`() {
        try {
            ArrayList<String>()[0]
        } catch (exception: Exception) {
            if (exception !is IndexOutOfBoundsException) {
                fail<Nothing>(exception.message)
            }
            assertEquals("Index 0 out of bounds for length 0", exception.message)
        }
    }
}
