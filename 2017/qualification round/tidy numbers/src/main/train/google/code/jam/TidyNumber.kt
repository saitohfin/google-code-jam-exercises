package train.google.code.jam

class TidyNumber(ordinary_number: Int) {

    private var number: Int = ordinary_number

    init {

        var builder = StringBuilder()
        var textNumber = ordinary_number.toString().toCharArray()
        var position: Int = textNumber.size - 1
        while (position > 0) {

            var currentDigit = textNumber[position]
            var previousDigit = textNumber[position - 1]
            if (currentDigit < previousDigit) {
                builder.append(9)
                textNumber[position - 1] = previousDigit - 1
            } else {
                builder.append(currentDigit)
            }

            position--
        }

        builder.append(textNumber[0])


        number = builder.toString().reversed().toInt()

    }

    fun number(): Int {
        return number
    }

}
