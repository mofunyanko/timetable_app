package com.example.timetableview

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ParentFragmentPagerAdapter(
    fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MonFragment()
            1 -> TueFragment()
            2 -> WedFragment()
            3 -> ThuFragment()
            else -> FriFragment()
        }
    }

    override fun getItemCount(): Int {
        return 5
    }
}