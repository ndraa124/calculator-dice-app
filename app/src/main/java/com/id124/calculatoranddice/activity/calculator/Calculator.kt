package com.id124.calculatoranddice.activity.calculator

import android.widget.TextView

open class Calculator(private val tvResult: TextView) {
    private var result = StringBuilder()
    private var operation: Char = ' '
    private var firstNum: Double = 0.0
    private var secondNum: Double = 0.0

    fun appendNumScreen(digit: String) {
        result.append(digit)
        tvResult.text = result.toString()
    }

    fun selectOperation(opt: Char) {
        operation = opt
        firstNum = tvResult.text.toString().toDouble()
        result.clear()
    }

    fun mathOperation() {
        secondNum = tvResult.text.toString().toDouble()
        result.clear()

        when (operation) {
            '+' -> {
                val plus = Operation.plus(firstNum, secondNum)
                tvResult.text = plus.toString()
                result.append(plus)
            }
            '-' -> {
                val minus = Operation.minus(firstNum, secondNum)
                tvResult.text = minus.toString()
                result.append(minus)
            }
            'X' -> {
                val times = Operation.times(firstNum, secondNum)
                tvResult.text = times.toString()
                result.append(times)
            }
            '/' -> {
                val divide = Operation.divide(firstNum, secondNum)
                tvResult.text = divide.toString()
                result.append(divide)
            }
        }
    }

    fun clearNum() {
        val length = result.length

        if (length <= 1) {
            clearNum("0")
        } else {
            result.deleteCharAt(length - 1)
            tvResult.text = result.toString()
        }
    }

    fun clearNum(defaultValue: String?) {
        result.clear()
        tvResult.text = defaultValue
    }
}