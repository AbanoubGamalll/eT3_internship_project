package com.example.et3_internship_project

import android.content.Context
import android.content.Intent
import android.graphics.Color.blue
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.samplemodel.view.*

class Adaptor(private var list: List<CoffeeModel>, private var context: Context) :
    RecyclerView.Adapter<Adaptor.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(LayoutInflater.from(context).inflate(R.layout.samplemodel, parent, false))

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        with(holder.itemView) {
            img_Cofee.setImageResource(list[position].img)
            txt_Name.text = list[position].Name
            txt_rating.text = list[position].Rating.toString()
            txt_review.text = list[position].reviews.toString() + " reviews"
            txt_location.text = list[position].location
        }
    }

    override fun getItemCount(): Int = list.size


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                val i = Intent(context, FullDetail::class.java)
                i.putExtra("Name",list[adapterPosition].Name)
                i.putExtra("img",list[adapterPosition].img)
                i.putExtra("Rating",list[adapterPosition].Rating)
                i.putExtra("reviews",list[adapterPosition].reviews)
                i.putExtra("location",list[adapterPosition].location)
                context.startActivity(i)
            }
            itemView.btn_favoritebutoon.setOnClickListener {
                if (it.btn_favoritebutoon.colorFilter == null) {
                    Toast.makeText(context, "Add To Favorite", Toast.LENGTH_SHORT).show()
                    it.btn_favoritebutoon.setColorFilter(context.resources.getColor(android.R.color.holo_orange_light))
                } else {
                    Toast.makeText(context, "delete To Favorite", Toast.LENGTH_SHORT).show()
                    it.btn_favoritebutoon.colorFilter = null
                }

            }
        }
    }

}