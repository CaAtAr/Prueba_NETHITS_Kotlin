package com.example.besthotels

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.besthotels.experiencias.ExperienciaMenu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_experiencia.setOnClickListener {
            startActivity(Intent(this, ExperienciaMenu::class.java))
        }
    }
}