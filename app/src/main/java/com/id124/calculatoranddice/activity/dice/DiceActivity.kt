package com.id124.calculatoranddice.activity.dice

import android.os.Bundle
import android.os.Handler
import android.view.View
import com.id124.calculatoranddice.R
import com.id124.calculatoranddice.activity.BaseActivity
import kotlinx.android.synthetic.main.activity_dice.*

class DiceActivity : BaseActivity() {
    private lateinit var dice: Dice

    override fun onCreate(savedInstanceState: Bundle?) {
        super.setLayout(R.layout.activity_dice)
        super.onCreate(savedInstanceState)

        supportActionBar?.title = getString(R.string.dice)
        dice = Dice(iv_dice, iv_dice_gif)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.iv_dice) {
            dice.showHide(0)

            Handler().postDelayed({
                dice.rollDice()
            }, 2000)
        }
    }
}