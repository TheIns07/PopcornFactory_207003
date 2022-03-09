package com.example.popcorn_207003

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.begginning_main)



        val confirmar: Button = findViewById(R.id.button_beg) as Button

        confirmar.setOnClickListener {
            var intento = Intent(this, CatalogoActivity::class.java)
            startActivity(intento)

        }

    }
}

