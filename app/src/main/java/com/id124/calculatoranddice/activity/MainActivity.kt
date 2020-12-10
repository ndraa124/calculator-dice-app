package com.id124.calculatoranddice.activity

import android.os.Bundle
import android.view.View
import com.id124.calculatoranddice.R
import com.id124.calculatoranddice.activity.calculator.CalculatorActivity
import com.id124.calculatoranddice.activity.dice.DiceActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.setLayout(R.layout.activity_main)
        super.onCreate(savedInstanceState)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_calculator -> {
                super.intents<CalculatorActivity>(this@MainActivity)
            }
            R.id.btn_dice -> {
                super.intents<DiceActivity>(this@MainActivity)
            }
        }
    }
}