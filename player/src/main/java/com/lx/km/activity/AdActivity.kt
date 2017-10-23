package com.lx.km.activity

import android.os.Bundle
import com.lx.km.R
import com.lx.km.base.BaseActivity
import kotlinx.android.synthetic.main.activity_ad.*

class AdActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ad)
        closeIcon.setOnClickListener { v ->
            {


            }
        }
    }


}
