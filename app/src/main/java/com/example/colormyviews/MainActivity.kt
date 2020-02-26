package com.example.colormyviews

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)

        }

        findViewById<TextView>(R.id.nickname_text).setOnClickListener {
            updateNickname(it)
        }
    }

    private fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)
        nicknameTextView.text = editText.text

        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE




        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)
        val boxElevenText = findViewById<TextView>(R.id.box_eleven_text)
        val boxTwelveText = findViewById<TextView>(R.id.box_twelve_text)
        val boxThirteenText = findViewById<TextView>(R.id.box_thirteen_text)
        val boxFourteenText = findViewById<TextView>(R.id.box_fourteen_text)
        val boxFifteenText = findViewById<TextView>(R.id.box_fifteen_text)
        val boxSixteenText = findViewById<TextView>(R.id.box_sixteen_text)
        val boxSeventeenText = findViewById<TextView>(R.id.box_seventeen_text)
        val boxEighteenText = findViewById<TextView>(R.id.box_eighteen_text)
        val boxNineteenText = findViewById<TextView>(R.id.box_nineteen_text)
        val boxTwentyText = findViewById<TextView>(R.id.box_twenty_text)
        val boxTwentyoneText = findViewById<TextView>(R.id.box_twentyone_text)
        val boxTwentytwoText = findViewById<TextView>(R.id.box_twentytwo_text)
        val boxTwentythreeText = findViewById<TextView>(R.id.box_twentythree_text)
        val boxTwentyfourText = findViewById<TextView>(R.id.box_twentyfour_text)
        val boxTwentyfive = findViewById<TextView>(R.id.box_twentyfive_text)
        boxOneText.visibility = View.VISIBLE
        boxTwoText.visibility = View.VISIBLE
        boxThreeText.visibility = View.VISIBLE
        boxFourText.visibility = View.VISIBLE
        boxFiveText.visibility = View.VISIBLE
        boxSixText.visibility = View.VISIBLE
        boxSevenText.visibility = View.VISIBLE
        boxEightText.visibility = View.VISIBLE
        boxNineText.visibility = View.VISIBLE
        boxTenText.visibility = View.VISIBLE
        boxElevenText.visibility = View.VISIBLE
        boxTwelveText.visibility = View.VISIBLE
        boxThirteenText.visibility = View.VISIBLE
        boxFourteenText.visibility = View.VISIBLE
        boxFifteenText.visibility = View.VISIBLE
        boxSixteenText.visibility = View.VISIBLE
        boxSeventeenText.visibility = View.VISIBLE
        boxEighteenText.visibility = View.VISIBLE
        boxNineteenText.visibility = View.VISIBLE
        boxTwentyText.visibility = View.VISIBLE
        boxTwentyoneText.visibility = View.VISIBLE
        boxTwentytwoText.visibility = View.VISIBLE
        boxTwentythreeText.visibility = View.VISIBLE
        boxTwentyfourText.visibility = View.VISIBLE
        boxTwentyfive.visibility = View.VISIBLE

        setListeners()


    }

    private fun updateNickname (view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val doneButton = findViewById<Button>(R.id.done_button)
        editText.visibility = View.VISIBLE
        doneButton.visibility = View.VISIBLE
        view.visibility = View.GONE
        // Set the focus to the edit text.
        editText.requestFocus()
        // Show the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, 0)

    }

    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_four_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_five_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_six_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_seven_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_eight_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_nine_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_ten_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_eleven_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_twelve_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_thirteen_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_fourteen_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_fifteen_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_sixteen_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_seventeen_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_eighteen_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_nineteen_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_twenty_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_twentyone_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_twentytwo_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_twentythree_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_twentyfour_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_twentyfive_text -> view.setBackgroundColor(Color.DKGRAY)


        }

    }

    private fun makeColored1(view: View) {
        when (view.id) {
            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_four_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_five_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_six_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_seven_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_eight_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_nine_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_ten_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_eleven_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_twelve_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_thirteen_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_fourteen_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_fifteen_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_sixteen_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_seventeen_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_eighteen_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_nineteen_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_twenty_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_twentyone_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_twentytwo_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_twentythree_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_twentyfour_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_twentyfive_text -> view.setBackgroundColor(Color.GRAY)


//            else -> view.setBackgroundColor(Color.LTGRAY)
        }

    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)
        val boxElevenText = findViewById<TextView>(R.id.box_eleven_text)
        val boxTwelveText = findViewById<TextView>(R.id.box_twelve_text)
        val boxThirteenText = findViewById<TextView>(R.id.box_thirteen_text)
        val boxFourteenText = findViewById<TextView>(R.id.box_fourteen_text)
        val boxFifteenText = findViewById<TextView>(R.id.box_fifteen_text)
        val boxSixteenText = findViewById<TextView>(R.id.box_sixteen_text)
        val boxSeventeenText = findViewById<TextView>(R.id.box_seventeen_text)
        val boxEighteenText = findViewById<TextView>(R.id.box_eighteen_text)
        val boxNineteenText = findViewById<TextView>(R.id.box_nineteen_text)
        val boxTwentyText = findViewById<TextView>(R.id.box_twenty_text)
        val boxTwentyoneText = findViewById<TextView>(R.id.box_twentyone_text)
        val boxTwentytwoText = findViewById<TextView>(R.id.box_twentytwo_text)
        val boxTwentythreeText = findViewById<TextView>(R.id.box_twentythree_text)
        val boxTwentyfourText = findViewById<TextView>(R.id.box_twentyfour_text)
        val boxTwentyfive = findViewById<TextView>(R.id.box_twentyfive_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText,boxSixText,boxSevenText,boxEightText,boxNineText,boxTenText,boxElevenText,boxTwelveText,boxThirteenText,boxFourteenText,boxFifteenText,boxSixteenText,boxSeventeenText,boxEighteenText,boxNineteenText,boxTwentyText,boxTwentyoneText,boxTwentytwoText,boxTwentythreeText,boxTwentyfourText,boxTwentyfive, rootConstraintLayout)

        for (item in clickableViews) {
            item.setOnClickListener {
                if(item.isSelected == true){
                    makeColored(it)
                    item.isSelected = false
                }else if(item.isSelected == false){
                    makeColored1(it)
                    item.isSelected = true

                }

            }

        }
    }




}
