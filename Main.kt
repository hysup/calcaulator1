//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val num1 = readln().toInt()
    val operator = readln().toString()
    val num2 = readln().toInt()
    var result = 0
    when(operator) {
        "+" -> result = Calculator().add(num1, num2)
        "-" -> result = Calculator(). subtract(num1, num2)
        "*" -> result = Calculator(). multiply(num1, num2)
        "/" -> result = Calculator(). divide(num1, num2)
        else -> println("Invalid operator")
    }

println("결과는 ${num1} ${operator} ${num2} = ${result}")
}