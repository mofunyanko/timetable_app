package com.example.timetableview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.view_pager)
        val tabLayout: TabLayout = findViewById(R.id.tab_layout)

        val pagerAdapter = ParentFragmentPagerAdapter(this)
        viewPager.adapter = pagerAdapter

        TabLayoutMediator(tabLayout, viewPager,) { tab, position ->
            val tabNames = listOf("月", "火", "水", "木", "金")
            tab.text = tabNames[position]
        }.attach()
    }
}