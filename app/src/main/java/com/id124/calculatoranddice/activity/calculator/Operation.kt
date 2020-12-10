package com.id124.calculatoranddice.activity.calculator

class Operation {
    companion object {
        fun plus(firstNum: Double, secondNum: Double): Double {
            return firstNum + secondNum
        }

        fun minus(firstNum: Double, secondNum: Double): Double {
            return firstNum - secondNum
        }

        fun divide(firstNum: Double, secondNum: Double): Double {
            return firstNum / secondNum
        }

        fun times(firstNum: Double, secondNum: Double): Double {
            return firstNum * secondNum
        }
    }
}