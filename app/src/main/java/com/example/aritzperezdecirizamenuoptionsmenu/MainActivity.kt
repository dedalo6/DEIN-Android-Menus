package com.example.aritzperezdecirizamenuoptionsmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        super.setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_options, menu)
//        val searchItem = menu?.findItem(R.id.buscar_action)
//        val searchView = searchItem?.actionView as SearchView
//        searchView.queryHint = "Nombre..."
//
//        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                Toast.makeText(this@MainActivity, "Búsqueda enviada: $query", Toast.LENGTH_SHORT).show()
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
////                adapter.filter.filter(newText)
//                return false
//            }
//        })

        return true }
}