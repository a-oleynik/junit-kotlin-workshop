package com.oleynik.qa.workshop.kotlin.junit.general

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.fail
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

// @Disabled("Disabled until @XXX333 is fixed")
class DisabledTest {

    @Disabled
    @Test
    fun `Disabled skips multiplication test`() {
        assertEquals(10, 2 * 5, "Multiplication result is wrong")
    }

    @Test
    fun `test without Disabled verifies division result`() {
        assertEquals(2.0, 10 / 5.0, 0.0)
    }

    @Test
    fun `test without Disabled verifies boolean conditions`() {
        val variable = true

        assertTrue(variable, "variable is not true")
        assertFalse(!variable, "!variable is not false")
    }

    @Test
    fun `test without Disabled does not call fail`() {
        val isFailed = false

        if (isFailed) {
            fail<Nothing>("The test is because isFailed is $isFailed")
        }
    }
}
