package com.example.curriculumvitae.Fragments


import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Button
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import androidx.fragment.app.Fragment
import com.example.curriculumvitae.R
import com.example.curriculumvitae.WebViewActivity
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_home.*


/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment(){

    lateinit var linkedInBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        linkedInBtn = view.findViewById(R.id.linkedInBtnHomeFragment)
        linkedInBtn.setOnClickListener {
            linkedBtnPressed()
        }
        return view

    }

    override fun onStart() {
        super.onStart()

        roundImage()
    }


    private fun roundImage() {
        val img = BitmapFactory.decodeResource(resources,R.drawable.girl)
        val round = RoundedBitmapDrawableFactory.create(resources,img)
        round.isCircular = true
        imageView.setImageDrawable(round)
    }

    //Actions
    fun linkedBtnPressed(){
        val intent = Intent (getActivity(), WebViewActivity::class.java)
        intent.putExtra("link","https://www.linkedin.com/company/prada")
        activity?.startActivity(intent)


    }

}
