package com.id124.calculatoranddice.activity.calculator

open class Operation {
    protected var firstNum: Double = 0.0
    protected var secondNum: Double = 0.0

    val plus: Double
        get() = firstNum + secondNum

    val minus: Double
        get() = firstNum - secondNum

    val divide: Double
        get() = firstNum / secondNum

    val times: Double
        get() = firstNum * secondNum
}