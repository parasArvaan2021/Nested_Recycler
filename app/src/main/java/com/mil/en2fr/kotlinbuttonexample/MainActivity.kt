package com.mil.en2fr.kotlinbuttonexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mil.en2fr.kotlinbuttonexample.UserData.User

class MainActivity : AppCompatActivity(){

    companion object{
        val TAG = MainActivity::class.java.simpleName
    }


    private var adapter :RecyclerAdapter=RecyclerAdapter(this,dummyUserData())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var recyclerView : RecyclerView=findViewById(R.id.recyclerView)
        for (data in dummyUserData()){
            Log.e(TAG, "onCreate: $data" )
        }
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter=adapter
    }
    fun dummyUserData():ArrayList<UserData> {
        return arrayListOf(
                UserData("January", arrayListOf(User("https://bit.ly/2VnwKtM", "pk","it"),
                    User("https://bit.ly/2VnwKtM", "paras","it"),
                    User("https://bit.ly/2VnwKtM", "paras","paras"))),
                UserData("February", arrayListOf(User("https://bit.ly/2VnwKtM", "paras","it"))),
                UserData("March", arrayListOf(User("https://bit.ly/2VnwKtM", "paras","it"),
                    User("https://bit.ly/2VnwKtM", "paras","it"))) ,
                UserData("April", arrayListOf(User("https://bit.ly/2VnwKtM", "paras","it"),
                   User("https://bit.ly/2VnwKtM", "paras","it")))
        )
    }
}
