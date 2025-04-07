package com.example.vke_2b_1

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun vke(view: View)
    {
        var vke:Double
        var boy:Double
        var kilo:Double

        boy = findViewById<EditText>(R.id.editTextBoy).text.toString().toDouble()
        kilo = findViewById<EditText>(R.id.editTextKilo).text.toString().toDouble()
        vke = kilo /((boy/100)*(boy/100))
        findViewById<TextView>(R.id.textViewVke2).text = vke.toString()
        if(vke<18.5)
        {
            findViewById<TextView>(R.id.textViewDurum2).text = "Zayıf"
        }
        if(vke>=18.5 && vke<25)
        {
            findViewById<TextView>(R.id.textViewDurum2).text = "Normal"
        }
        if(vke>=25&&vke<30)
        {
            findViewById<TextView>(R.id.textViewDurum2).text = "Şişman"
        }
        if(vke>=30)
        {
            findViewById<TextView>(R.id.textViewDurum2).text = "Obez"
        }

    }
}