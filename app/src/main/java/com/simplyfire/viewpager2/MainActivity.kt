package com.simplyfire.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // uncomment it for adapter which uses views instead of fragments
        // viewPager2.adapter = ViewPagerAdapter()
        viewPager2.adapter = ViewPagerFragmentStateAdapter(this)
    }
}
