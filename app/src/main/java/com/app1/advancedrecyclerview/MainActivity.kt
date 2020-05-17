package com.app1.advancedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = ArrayList<CustomClass>()

        items.add(CustomClass("Sea", R.drawable.slide_1))
        items.add(CustomClass("nature", R.drawable.slide_2))
        items.add(CustomClass("forest", R.drawable.slide_3))
        items.add(CustomClass("Sky", R.drawable.slide_3))
        items.add(CustomClass("Magma", R.drawable.slide_2))
        items.add(CustomClass("river", R.drawable.slide_3))
        items.add(CustomClass("jungle", R.drawable.slide_4))

        val recycler = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = Adapter(items, this@MainActivity)

        recycler.layoutManager = GridLayoutManager(this@MainActivity, 2)
        recycler.adapter = adapter

    }

}
