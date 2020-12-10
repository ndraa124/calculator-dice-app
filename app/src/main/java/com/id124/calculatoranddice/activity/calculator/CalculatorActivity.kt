package com.id124.calculatoranddice.activity.calculator

import android.os.Bundle
import android.view.View
import com.id124.calculatoranddice.R
import com.id124.calculatoranddice.activity.BaseActivity
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : BaseActivity() {
    private lateinit var calculator: Calculator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        supportActionBar?.title = getString(R.string.calculator)

        calculator = Calculator(tv_result)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_zero -> {
                calculator.appendNumScreen("0")
            }
            R.id.btn_one -> {
                calculator.appendNumScreen("1")
            }
            R.id.btn_two -> {
                calculator.appendNumScreen("2")
            }
            R.id.btn_three -> {
                calculator.appendNumScreen("3")
            }
            R.id.btn_four -> {
                calculator.appendNumScreen("4")
            }
            R.id.btn_five -> {
                calculator.appendNumScreen("5")
            }
            R.id.btn_six -> {
                calculator.appendNumScreen("6")
            }
            R.id.btn_seven -> {
                calculator.appendNumScreen("7")
            }
            R.id.btn_eight -> {
                calculator.appendNumScreen("8")
            }
            R.id.btn_nine -> {
                calculator.appendNumScreen("9")
            }
            R.id.btn_point -> {
                calculator.appendNumScreen(".")
            }
        }
    }

    fun onClickOperational(v: View) {
        when (v.id) {
            R.id.btn_divide -> {
                calculator.selectOperation('/')
            }
            R.id.btn_times -> {
                calculator.selectOperation('X')
            }
            R.id.btn_plus -> {
                calculator.selectOperation('+')
            }
            R.id.btn_minus -> {
                calculator.selectOperation('-')
            }
        }
    }

    fun onClickFunctional(v: View) {
        when (v.id) {
            R.id.btn_clear_all -> {
                calculator.clearNum("0")
            }
            R.id.btn_clear -> {
                calculator.clearNum()
            }
            R.id.btn_backspace -> {
                calculator.clearNum()
            }
            R.id.btn_equal -> {
                calculator.mathOperation()
            }
        }
    }
}