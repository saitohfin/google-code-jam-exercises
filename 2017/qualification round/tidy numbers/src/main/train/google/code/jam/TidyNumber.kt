package train.google.code.jam

class TidyNumber(ordinary_number: Long) {

    private var number: Long = extractLowerTidyNumber(ordinary_number)

    private fun extractLowerTidyNumber(ordinary_number: Long): Long {
        val textNumber = ordinary_number.toString().toCharArray()
        var position: Int = textNumber.size - 1
        while (position > 0) {

            val currentDigit = textNumber[position]
            val previousDigit = textNumber[position - 1]
            if (currentDigit < previousDigit) {
                textNumber[position] = '9'
                textNumber[position - 1] = previousDigit - 1
            }
            position--
        }

        return textNumber.joinToString("").toLong()
    }

    fun number(): Long {
        return number
    }

}
