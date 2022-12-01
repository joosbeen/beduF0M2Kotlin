package com.example.app.beduf0m2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app.beduf0m2kotlin.adapters.FrutasAdapter
import com.example.app.beduf0m2kotlin.data.DataSource

class MiRecyclerviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mi_recyclerview)

        val plantaLista: RecyclerView = findViewById(R.id.recycler_view) // (1)

        plantaLista.setHasFixedSize(true)
        plantaLista.setLayoutManager(LinearLayoutManager(this))

        val plantaAdapter = FrutasAdapter(this, DataSource.data) // (2)
        plantaLista.adapter = plantaAdapter // (3)

    }
}