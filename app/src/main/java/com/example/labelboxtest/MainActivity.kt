package com.example.labelboxtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dropdown_menu.*
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item = arrayOf<String>("Item 1","Item 2","Item 3","Item 4")

        var adapter = ArrayAdapter<Any>(this,R.layout.dropdown_menu,item)

        filled_exposed_dropdown.setAdapter(adapter)


    }

}
