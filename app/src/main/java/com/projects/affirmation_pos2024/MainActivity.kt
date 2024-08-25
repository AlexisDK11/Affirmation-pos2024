package com.projects.affirmation_pos2024

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.projects.affirmation_pos2024.adapter.ItemAdapter
import com.projects.affirmation_pos2024.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview  = findViewById<RecyclerView>(R.id.recycler_view)

        val myDataset = DataSource().loadAffirmation()

        recyclerview.adapter = ItemAdapter(this, myDataset)

        recyclerview.setHasFixedSize(false) //TRUE carrega todos os elementos, FALSE mostra alguns elementos e vai aumentando gradativamente.
    }
}