package com.example.et3_internship_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_full_detail.*

class FullDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_detail)

        supportActionBar?.hide()

        imgCofee.setImageResource(intent.getIntExtra("img", R.drawable.image1))
        txt_Name.text = intent.getStringExtra("Name")
        txt_rating.text = intent.getFloatExtra("Rating", 0f).toString() + "reviews"
        txt_review.text = intent.getIntExtra("reviews", 0).toString()
        txt_location.text =intent.getStringExtra("location")
    }

    fun Back(view: View) {
        onBackPressed()
    }


    fun OrderNow(view: View) {
        Toast.makeText(this, "Order Added", Toast.LENGTH_SHORT).show()
    }
}