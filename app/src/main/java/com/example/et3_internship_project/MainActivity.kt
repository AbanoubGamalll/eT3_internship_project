package com.example.et3_internship_project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var displayAdapter: Adaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val list = mutableListOf<CoffeeModel>()
        list.add(CoffeeModel(R.drawable.image1, "a", 4.4f, 429, "New Cairo,Egypt"))
        list.add(CoffeeModel(R.drawable.image2, "b", 4.3f, 430, "New Cairo,Egypt"))
        list.add(CoffeeModel(R.drawable.image3, "c", 4.2f, 435, "USA"))
        list.add(CoffeeModel(R.drawable.image4, "d", 4.1f, 436, "Egypy"))
        list.add(CoffeeModel(R.drawable.image1, "a", 4.4f, 429, "New Cairo,Egypt"))
        list.add(CoffeeModel(R.drawable.image2, "b", 4.3f, 430, "New Cairo,Egypt"))
        list.add(CoffeeModel(R.drawable.image3, "c", 4.2f, 435, "USA"))
        list.add(CoffeeModel(R.drawable.image4, "d", 4.1f, 436, "Egypy"))
        list.add(CoffeeModel(R.drawable.image1, "a", 4.4f, 429, "New Cairo,Egypt"))
        list.add(CoffeeModel(R.drawable.image2, "b", 4.3f, 430, "New Cairo,Egypt"))
        list.add(CoffeeModel(R.drawable.image3, "c", 4.2f, 435, "USA"))
        list.add(CoffeeModel(R.drawable.image4, "d", 4.1f, 436, "Egypy"))
        list.add(CoffeeModel(R.drawable.image1, "a", 4.4f, 429, "New Cairo,Egypt"))
        list.add(CoffeeModel(R.drawable.image2, "b", 4.3f, 430, "New Cairo,Egypt"))
        list.add(CoffeeModel(R.drawable.image3, "c", 4.2f, 435, "USA"))
        list.add(CoffeeModel(R.drawable.image4, "d", 4.1f, 436, "Egypy"))
        setupRecyclerView(list)
    }


    private fun setupRecyclerView(items: List<CoffeeModel>) {
        displayAdapter = Adaptor(items, this@MainActivity)

        RV_recyclerView1.layoutManager =
            GridLayoutManager(this, 2)

        RV_recyclerView1.adapter = displayAdapter
    }
}