package LV3

class DivideOperator {
    fun operate(num1: Double, num2: Double): Double {
        if (num2 == 0.0) {
            throw ArithmeticException("Cannot be divide by zero!")
        }
        return num1 / num2
    }
}

