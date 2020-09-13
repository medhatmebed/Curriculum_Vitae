package com.example.curriculumvitae
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

import com.example.curriculumvitae.Fragments.*


internal class PagerViewAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                Contact()
            }
            2 -> {
                AboutMeFragment()
            }
            3 -> {
                WorkExperienceFragment()
            }
            else -> Fragment()
        }
    }

    override fun getCount(): Int {

        return 4
    }

}