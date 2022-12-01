package com.example.app.beduf0m2kotlin.http

import android.widget.Toast
import java.io.BufferedInputStream
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class HttpOperations {

    fun httpGet(api: String): String {

        // "https://catfact.ninja/fact"
        val url: URL = URL(api)
        val urlConnection: HttpURLConnection = url.openConnection() as HttpURLConnection
        var http: String = ""

        try {

            //val impstr: InputStream = BufferedInputStream(urlConnection.getInputStream())

            if (urlConnection.responseCode != 200) {
                return "http"
            }

            val rd = BufferedReader(InputStreamReader(urlConnection.inputStream))


            val response = StringBuilder()
            var inputLine: String

            rd.lineSequence().forEach {
                response.append(it);
            }

            rd.close();
            println(response.toString())
            http = response.toString()

        } finally {
            urlConnection.disconnect();
        }

        return http

    }
}