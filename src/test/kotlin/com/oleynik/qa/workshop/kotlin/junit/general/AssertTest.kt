package com.oleynik.qa.workshop.kotlin.junit.general

import com.oleynik.qa.workshop.kotlin.junit.model.User
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertNotSame
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertSame
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.fail
import org.junit.jupiter.api.Test

class AssertTest {

    @Test
    fun `assertEquals verifies multiplication result`() {
        assertEquals(10, 2 * 5, "Multiplication result is wrong")
    }

    @Test
    fun `assertEquals verifies division result within delta`() {
        assertEquals(1.9, 10 / 5.0, 0.2)
    }

    @Test
    fun `assertTrue and assertFalse verify boolean conditions`() {
        val variable = true

        assertTrue(variable, "variable is not true")
        assertFalse(!variable, "!variable is not false")
    }

    @Test
    fun `fail explicitly marks a test as failed`() {
        val isFailed = false

        if (isFailed) {
            fail<Nothing>("The test is failed because isFailed equals to $isFailed")
        }
    }

    @Test
    fun `assertNull verifies that value is null`() {
        val myObject: Any? = null

        assertNull(myObject, "My object is not null")
    }

    @Test
    fun `assertNotNull verifies that value is not null`() {
        val myObject = Any()

        assertNotNull(myObject, "My object is null")
    }

    @Test
    fun `assertSame verifies that references point to the same object`() {
        val user1 = User(
            surname = "Crocodilovich",
            name = "Crocodil",
            yearOfBirth = 1991,
        )

        assertSame(user1, user1, "The users should be the same instance")
    }

    @Test
    fun `assertNotSame verifies that references point to different objects`() {
        val user1 = User(
            surname = "Crocodilovich",
            name = "Crocodil",
            yearOfBirth = 1991,
        )
        val user2 = user1.copy()

        assertNotSame(user1, user2, "The users should be different instances")
    }
}
