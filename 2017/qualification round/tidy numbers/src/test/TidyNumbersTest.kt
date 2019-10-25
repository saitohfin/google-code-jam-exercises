package train.google.code.jam

import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class TidyNumbersTest() {

    @BeforeTest
    fun setUp() {
    }

    @Test
    fun numbers_lowers_than_ten_are_tidy() {
        var numbers = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        for (number in 0 until 10) {
            val tidyNumber = TidyNumber(number)
            assertEquals(number, tidyNumber.number())
        }
    }

    @Test
    fun number_with_digits_are_higher_than_before_is_tidy() {
        var number = 19
        val tidyNumber = TidyNumber(number)
        assertEquals(number, tidyNumber.number())
    }

    @Test
    fun number_with_digits_are_equals_is_tidy() {
        var number = 55
        val tidyNumber = TidyNumber(number)
        assertEquals(number, tidyNumber.number())
    }

    @Test
    fun number_10_first_digit_is_higher_than_next_return_a_lower_tidynumber_9() {
        var expected = 9
        var number = 10
        val tidyNumber = TidyNumber(number)
        assertEquals(expected, tidyNumber.number())
    }

    @Test
    fun number_132_digitS_not_shorted_return_a_lower_tidynumber_129() {
        var expected = 9
        var number = 10
        val tidyNumber = TidyNumber(number)
        assertEquals(expected, tidyNumber.number())
    }
}