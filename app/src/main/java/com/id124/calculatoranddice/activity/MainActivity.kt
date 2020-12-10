package com.id124.calculatoranddice.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.id124.calculatoranddice.R
import com.id124.calculatoranddice.activity.calculator.CalculatorActivity
import com.id124.calculatoranddice.activity.dice.DiceActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_calculator -> {
                startActivity(Intent(this@MainActivity, CalculatorActivity::class.java))
            }
            R.id.btn_dice -> {
                startActivity(Intent(this@MainActivity, DiceActivity::class.java))
            }
        }
    }
}