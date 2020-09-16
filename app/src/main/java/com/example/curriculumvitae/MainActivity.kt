package com.example.curriculumvitae

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    private lateinit var homeBtn: ImageButton
    private lateinit var workPortofolioBtn: ImageButton
    private lateinit var aboutMeBtn: ImageButton
    private lateinit var contactBtn: ImageButton

    private lateinit var mViewPager: ViewPager
    private lateinit var mPagerViewAdapter: PagerViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // init views
        mViewPager = findViewById(R.id.mViewPager)
        homeBtn = findViewById(R.id.homeBtn)

        contactBtn = findViewById(R.id.contactBtn)
        aboutMeBtn = findViewById(R.id.aboutMeBtn)
        workPortofolioBtn = findViewById(R.id.WorkExperBtn)


        //onclick listner

        homeBtn.setOnClickListener {
            mViewPager.currentItem = 0

        }

        aboutMeBtn.setOnClickListener {

            mViewPager.currentItem = 1

        }



        workPortofolioBtn.setOnClickListener {
            mViewPager.currentItem = 2

        }

        contactBtn.setOnClickListener {
            mViewPager.currentItem = 3

        }




        mPagerViewAdapter = PagerViewAdapter(supportFragmentManager)
        mViewPager.adapter = mPagerViewAdapter
        mViewPager.offscreenPageLimit = 4



        mViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                changeTabs(position)
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })




        mViewPager.currentItem = 0
        homeBtn.setImageResource(R.drawable.ic_home_black_)





    }

    private fun changeTabs(position: Int) {


        if (position == 0) {
            homeBtn.setImageResource(R.drawable.ic_home_black_)
            aboutMeBtn.setImageResource(R.drawable.ic_person_outline_)
            workPortofolioBtn.setImageResource(R.drawable.ic_add_black)
            contactBtn.setImageResource(R.drawable.ic_notifications_blck)




        }
        if (position == 1) {
            homeBtn.setImageResource(R.drawable.ic_home_black_)
            aboutMeBtn.setImageResource(R.drawable.ic_person_outline_)
            workPortofolioBtn.setImageResource(R.drawable.ic_add_black)
            contactBtn.setImageResource(R.drawable.ic_notifications_blck)




        }

        if (position == 2) {
            homeBtn.setImageResource(R.drawable.ic_home_black_)
            aboutMeBtn.setImageResource(R.drawable.ic_person_outline_)
            workPortofolioBtn.setImageResource(R.drawable.ic_add_black)
            contactBtn.setImageResource(R.drawable.ic_notifications_blck)

        }
        if (position == 3) {
            homeBtn.setImageResource(R.drawable.ic_home_black_)
            aboutMeBtn.setImageResource(R.drawable.ic_person_outline_)
            workPortofolioBtn.setImageResource(R.drawable.ic_add_black)
            contactBtn.setImageResource(R.drawable.ic_notifications_blck)

        }



    }


}
