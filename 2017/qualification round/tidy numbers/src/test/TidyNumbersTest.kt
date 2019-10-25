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
        for (number in 0 until 10) {
            val tidyNumber = TidyNumber(number.toLong())
            assertEquals(number.toLong(), tidyNumber.number())
        }
    }

    @Test
    fun number_with_digits_are_higher_than_before_is_tidy() {
        val number = 19
        val tidyNumber = TidyNumber(number.toLong())
        assertEquals(number.toLong(), tidyNumber.number())
    }

    @Test
    fun number_with_digits_are_equals_is_tidy() {
        val number = 55
        val tidyNumber = TidyNumber(number.toLong())
        assertEquals(number.toLong(), tidyNumber.number())
    }

    @Test
    fun number_10_first_digit_is_higher_than_next_return_a_lower_tidynumber_9() {
        val expected = 9
        val number = 10
        val tidyNumber = TidyNumber(number.toLong())
        assertEquals(expected.toLong(), tidyNumber.number())
    }

    @Test
    fun number_132_digitS_not_shorted_return_a_lower_tidynumber_129() {
        val expected = 129
        val number = 132
        val tidyNumber = TidyNumber(number.toLong())
        assertEquals(expected.toLong(), tidyNumber.number())
    }

    @Test
    fun number_111111111111111110_digitS_not_shorted_return_a_lower_tidynumber_99999999999999999() {
        val expected = 99999999999999999
        val number = 111111111111111110
        val tidyNumber = TidyNumber(number)
        assertEquals(expected, tidyNumber.number())
    }
}