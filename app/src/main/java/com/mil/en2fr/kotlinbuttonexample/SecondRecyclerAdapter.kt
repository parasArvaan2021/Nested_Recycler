package com.mil.en2fr.kotlinbuttonexample

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.jackandphantom.circularimageview.CircleImage

class SecondRecyclerAdapter(
    val context: Context,
    val model: List<UserData.User>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view : View=LayoutInflater.from(context).inflate(R.layout.item_header_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return model.count()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val viewholder :ViewHolder =holder as ViewHolder
            val user:UserData.User=model[position]
             viewholder.name.text=user.name
            val url:String=user.picture
        Log.i("imgUrl", "onBindViewHolder: $url")
        Glide
            .with(context)
            .load("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg")
            .error(R.drawable.nature)
            .placeholder(R.mipmap.ic_launcher)
            .into(viewholder.cir_img)

    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            var name : TextView=itemView.findViewById(R.id.txt_item_name)
            var cir_img : CircleImage=itemView.findViewById(R.id.circleImage)
    }
}