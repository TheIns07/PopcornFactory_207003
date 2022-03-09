package com.example.popcorn_207003

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*


class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        var bundle = intent.extras
        var ns = 0
        var id = -1;
        var title = "";

        var btnMain: Button = findViewById(R.id. button_buy_tickets) as Button


        if(bundle != null){
            ns = bundle.getInt("asientosDisponibles")
            title = bundle.getString("titulo")!!
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            tv_pelicula_nombre.setText(bundle.getString("titulo"))
            tv_pelicula_descripcion.setText(bundle.getString("sinopsis"))
            seats_left.setText("$ns seats avaliable")
            id = bundle.getInt("id")
        }

        if(ns == 0){
            btnMain.isEnabled = false
        }
        else {
            btnMain.setOnClickListener{
                val intent: Intent = Intent (this, SeleccionTicket::class.java)
                intent.putExtra("id", id)
                intent.putExtra("titulo", title)

                this.startActivity(intent)

            }
        }

    }
}