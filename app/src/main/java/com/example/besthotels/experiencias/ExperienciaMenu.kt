package com.example.besthotels.experiencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.besthotels.R
import kotlinx.android.synthetic.main.activity_experiencia_menu.*

class ExperienciaMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_experiencia_menu)

        btn_puntos_interes.setOnClickListener {
            startActivity(Intent(this, PuntosinteresMenu::class.java))
        }

    }
}