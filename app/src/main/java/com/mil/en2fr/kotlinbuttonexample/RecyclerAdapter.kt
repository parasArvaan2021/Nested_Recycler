package com.mil.en2fr.kotlinbuttonexample

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(
        val context:Context,
        val datamodel: ArrayList<UserData>
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
                val view:View=LayoutInflater.from(context).inflate(R.layout.item_name_layout,parent,false)
        return ViewHolder1(view)
    }

    override fun getItemCount(): Int {
           return datamodel.count()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.i("paras", "onBindViewHolder: "+getItemViewType(position) + position)
        val viewholder1 : ViewHolder1=holder as ViewHolder1
        val user : UserData=datamodel[position]
        viewholder1.title.text=user.month
        viewholder1.recyclerView.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        val secondAdapter= SecondRecyclerAdapter(context,datamodel[position].user)
        viewholder1.recyclerView.adapter=secondAdapter
    }

    inner class ViewHolder1(itemView: View) : RecyclerView.ViewHolder(itemView){
        var title:TextView=itemView.findViewById(R.id.txt_show_month)
        var recyclerView :RecyclerView=itemView.findViewById(R.id.second_recycler)
    }
}