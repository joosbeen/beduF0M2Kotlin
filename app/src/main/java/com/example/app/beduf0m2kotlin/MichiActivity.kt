package com.example.app.beduf0m2kotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.app.beduf0m2kotlin.http.HttpOperations
import java.io.BufferedInputStream
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class MichiActivity : AppCompatActivity() {

    private var txtMichiInfo: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_michi)

        txtMichiInfo = findViewById<TextView>(R.id.txtMichiInfo)
    }

    fun onCLickLoad(view: View) {
        val http = HttpOperations()
        val json = http.httpGet("https://catfact.ninja/fact")
        txtMichiInfo?.text  = json
    }

}
