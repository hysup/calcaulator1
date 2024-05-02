package LV3

class Calculator {
    fun add(operator: AddOperator, num1 : Double, num2 : Double) : Double = operator.operate(num1, num2)
    fun subtract(operator: SubtractOperator, num1 : Double, num2 : Double) : Double = operator.operate(num1, num2)
    fun multiply(operator: MultiplyOperator, num1 : Double, num2 : Double) : Double = operator.operate(num1, num2)
    fun divide(operator: DivideOperator, num1 : Double, num2 : Double) : Double = operator.operate(num1, num2)


}