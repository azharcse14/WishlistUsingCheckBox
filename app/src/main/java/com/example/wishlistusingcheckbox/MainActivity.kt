package com.example.wishlistusingcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wishlist = findViewById<CheckBox>(R.id.wishlist_id)

        wishlist.setOnCheckedChangeListener{ checkBox, isChecked->
            if (isChecked){
                println("isChecked")
            }else{
                println("kiccuna")
            }
        }

//        wishlist.setOnCheckedChangeListener { compoundButton, b ->
//            if (b){
//
//            }
//        }
    }
}