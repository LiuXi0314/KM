package com.lx.km.activity

import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import com.lx.km.R
import com.lx.km.base.BaseActivity
import com.lx.km.utils.LogUtils
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 首页
 */
class MainActivity : BaseActivity(), Toolbar.OnMenuItemClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initToolbar()

    }

    private fun initToolbar() {
        toolbar.setTitle("KM PLAYER")
//        toolbar.setLogo(ContextCompat.getDrawable(this, R.drawable.ic_album_black_36dp))
        setSupportActionBar(toolbar)
        toolbar.setOnMenuItemClickListener(this)

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        if (item!!.itemId == R.id.setting)
            setting()
        else if (item!!.itemId == R.id.search)
            search()
        return true
    }

    private fun setting() {
        LogUtils.d("Setting")
    }

    private fun search() {
        LogUtils.d("Search")
    }



}

