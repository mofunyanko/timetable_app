package com.example.tableview

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tableview.MonFragment
import com.example.tableview.TueFragment
import com.example.tableview.WedFragment
import com.example.tableview.ThuFragment
//import com.example.tableview.FriFragment

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when (position) {
            // どのFragmentを表示するか
            0 -> {return  MonFragment()}
            1 -> {return  TueFragment()}
            2 -> {return  WedFragment()}
            3 -> {return  ThuFragment()}
            4 -> {return  FriFragment()}
            else -> {return  MonFragment()}
        }
    }

    // スワイプビューの数が5つだから
    override fun getCount(): Int {
        return 5;
    }

    // スワイプビューのタイトルを決める
    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> {return "月"}
            1 -> {return  "火"}
            2 -> {return "水"}
            3 -> {return  "木"}
            4 -> {return  "金"}
            else -> {return null}
        }
    }
}
