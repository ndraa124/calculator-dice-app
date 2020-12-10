package com.id124.calculatoranddice.activity.dice

import android.view.View
import android.widget.ImageView
import com.id124.calculatoranddice.R
import pl.droidsonroids.gif.GifImageView
import java.util.*

class Dice(private val ivDice: ImageView, private val ivDiceGif: GifImageView) {
    private var resDraw: Int = 0

    fun rollDice() {
        resDraw = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_one
            2 -> R.drawable.dice_two
            3 -> R.drawable.dice_three
            4 -> R.drawable.dice_four
            5 -> R.drawable.dice_five
            else -> R.drawable.dice_six
        }

        showHide(1)
        ivDice.setImageResource(resDraw)
    }

    fun showHide(show: Int) {
        if (show == 0) {
            ivDice.visibility = View.GONE
            ivDiceGif.visibility = View.VISIBLE
        } else {
            ivDiceGif.visibility = View.GONE
            ivDice.visibility = View.VISIBLE
        }
    }
}