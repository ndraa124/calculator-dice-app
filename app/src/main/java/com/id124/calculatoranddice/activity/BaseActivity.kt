package com.id124.calculatoranddice.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(), View.OnClickListener {
    private var mLayoutRes: Int? = null

    protected open fun setLayout(layoutRes: Int) {
        mLayoutRes = layoutRes
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mLayoutRes!!)
    }

    protected inline fun <reified ClassActivity> intents(context: Context) {
        context.startActivity(Intent(context, ClassActivity::class.java))
    }
}