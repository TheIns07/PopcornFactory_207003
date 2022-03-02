package com.example.popcorn_207003

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*
import kotlinx.android.synthetic.main.movie.*


class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        var bundle = intent.extras

        /**var btnMain: Button = findViewById(R.id.button_beg) as Button

        btnMain.setOnClickListener{
            var intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        */
        if(bundle != null){
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            tv_pelicula_nombre.setText(bundle.getString("nombre"))
            iv_pelicula_sinopsis.setText(bundle.getString("sinopsis"))
        }

    }
}