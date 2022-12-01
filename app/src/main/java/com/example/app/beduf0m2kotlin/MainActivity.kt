package com.example.app.beduf0m2kotlin

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var btnClickMe: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClickMe =  findViewById(R.id.btnClickMe);

        val SDK_INT = Build.VERSION.SDK_INT
        if (SDK_INT > 8) {
            val policy = ThreadPolicy.Builder()
                .permitAll().build()
            StrictMode.setThreadPolicy(policy)
        }
    }

    fun onClickBtnClickMe(view: View) {

        val btnText = btnClickMe.text.toString();

        if (btnText == "Soy Azul") {
            btnClickMe.setBackgroundColor(Color.RED)
            btnClickMe.text = "Soy Rojo"
        } else {
            btnClickMe.setBackgroundColor(Color.BLUE)
            btnClickMe.text = "Soy Azul"
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.activities_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.item_menu_parametro -> {
                openActivityParametro()
                true
            }

            R.id.item_menu_recyclerview -> {
                //openActivityRecyclerview()
                openActivity(MiRecyclerviewActivity::class.java)
                true
            }

            R.id.item_menu_michis -> {
                openActivity(MichiActivity::class.java)
                //openActivityMichis()
                true
            }
            R.id.item_menu_weather -> {
                openActivity(WeatherActivity::class.java)
                //openActivityWeather()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun openActivityParametro() {
        val intent = Intent(this, ParametrosActivity::class.java)
        intent.putExtra("nombre", "JOSE BENITO")
        intent.putExtra("apellidos", "GARCIA SOLANO")
        startActivity(intent)
    }

    /*
    private fun openActivityWeather() {
        val intent = Intent(this, WeatherActivity::class.java)
        startActivity(intent)
    }

    private fun openActivityMichis() {
        val intent = Intent(this, MichiActivity::class.java)
        startActivity(intent)
    }
    */

    private fun openActivity(cls: Class<*>) {
        val intent = Intent(this, cls)
        startActivity(intent)
    }


}