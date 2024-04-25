//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val num1 = readln().toInt()
    val operator = readln().toString()
    val num2 = readln().toInt()

    if (operator == "+") {
        println("${num1 + num2}")
    } else if (operator == "-") {
        println("${num1 - num2}")
    } else if (operator == "*") {
        println("${num1 * num2}")
    } else if (operator == "/") {
        println("${num1 / num2}")
    } else if (operator == "%") {
        println("나머지는 ${num1 % num2}")
    } else {
        println("잘못된 연산입니다")
    }
}