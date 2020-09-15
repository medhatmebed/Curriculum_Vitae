package com.example.curriculumvitae.Fragments


import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.curriculumvitae.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


/**
 * A simple [Fragment] subclass.
 */
class AboutMeFragment : Fragment() {

    lateinit var floatingBtn : FloatingActionButton
    var skill = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_aboutme, container, false)

        floatingBtn = view.findViewById(R.id.floatingActionBtn)
        floatingBtn.setOnClickListener {
            floatinBtnPressed()
        }
        return view
    }

    //Actions

    fun floatinBtnPressed(){
        //to show alert dialog
        alertDialogDemo()

    }

    //setup custome alert dialog with two buttons and edittext
    fun alertDialogDemo() {
        // get alert_dialog.xml view
        val li =
            LayoutInflater.from(getActivity())
        val promptsView: View = li.inflate(R.layout.alert_dialog, null)
        val alertDialogBuilder =
            getActivity()?.let {
                AlertDialog.Builder(
                    it
                )
            }

        // set alert_dialog.xml to alertdialog builder
        alertDialogBuilder?.setView(promptsView)
        val userInput =
            promptsView.findViewById<View>(R.id.etUserInput) as EditText

        // set dialog message
        alertDialogBuilder
            ?.setCancelable(false)
            ?.setPositiveButton("OK") { dialog, id -> // get user input and set it to result
                // edit text

                if (userInput.text.isNotEmpty()) {
                    val ll = getActivity()?.findViewById<View>(R.id.linearLayout) as LinearLayout
                    val text = TextView(this.activity)
                    text.text = userInput.text.toString()
                    text.textSize = 24f
                    text.setBackgroundColor(Color.DKGRAY)
                    text.setTextColor(Color.WHITE)
                    text.paddingLeft
                    text.paddingRight
                    val left = 6
                    val top = 12
                    val right = 6
                    val bottom = 6
                    val params = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                    params.setMargins(left, top, right, bottom)
                    text.setLayoutParams(params);
                    ll.addView(text)

                }else {
                    Toast.makeText(
                        getActivity()?.getApplicationContext(),
                        "please enter the skill" ,
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            ?.setNegativeButton(
                "Cancel"
            ) { dialog, id -> dialog.cancel() }

        // create alert dialog
        val alertDialog = alertDialogBuilder?.create()

        // show it
        alertDialog?.show()
    }


}
