package eu.tutorials.oopexample

import eu.tutorials.oopexample.models.kiss.Validator
import org.junit.Test
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue


class ValidatorTestFixed {

    var validator: Validator? = null


    @Test
    fun checkValidPasswords() {
        assertTrue(validator!!.isPasswordValid("Abcde0"))
        assertTrue(validator!!.isPasswordValid("1234Ab"))
        assertTrue(validator!!.isPasswordValid("Abc d0"))
    }

    @Test
    fun checkEmptyPassword() {
        assertFalse(validator!!.isPasswordValid(""))
    }

    @Test
    fun checkToShortPassword() {
        assertFalse(validator!!.isPasswordValid("Abcd0"))
    }

    @Test
    fun checkOnlySmallLettersPassword() {
        assertFalse(validator!!.isPasswordValid("abcdef"))
    }

    @Test
    fun checkOnlyBigLettersPassword() {
        assertFalse(validator!!.isPasswordValid("ABCDEF"))
    }

    @Test
    fun checkOnlyNumbersPassword() {
        assertFalse(validator!!.isPasswordValid("123456"))
    }
}