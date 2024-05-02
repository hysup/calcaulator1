package LV3


fun main() {
    val num1 = readln().toDouble()
    val operator = readln().toString()
    val num2 = readln().toDouble()

    val calculator = Calculator()
    when(operator) {
        "+"-> println("Result : ${calculator.add(AddOperator(), num1, num2)}")
        "-"-> println("Result : ${calculator.subtract(SubtractOperator(), num1, num2)}")
        "*"-> println("Result : ${calculator.multiply(MultiplyOperator(), num1, num2)}")
        "/"-> println("Result : ${calculator.divide(DivideOperator(), num1, num2)}")
        else -> throw RuntimeException("Invalid operator")
    }
}