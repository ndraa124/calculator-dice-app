package com.id124.calculatoranddice.activity.calculator

import android.widget.TextView

class Calculator(private val tvResult: TextView) : Operation() {
    private var result = StringBuilder()
    private var operation: Char = ' '

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
                tvResult.text = plus.toString()
                result.append(plus)
            }
            '-' -> {
                tvResult.text = minus.toString()
                result.append(minus)
            }
            'X' -> {
                tvResult.text = times.toString()
                result.append(times)
            }
            '/' -> {
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