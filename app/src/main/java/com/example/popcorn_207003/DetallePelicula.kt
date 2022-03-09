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

        /**var btnMain: Button = findViewById(R.id.button_beg) as Button

        btnMain.setOnClickListener{
            var intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        */
        if(bundle != null){
            ns = bundle.getInt("asientosDisponibles")
            title = bundle.getString("titulo")!!
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            tv_pelicula_nombre.setText(bundle.getString("nombre"))
            tv_pelicula_descripcion.setText(bundle.getString("sinopsis"))
            seats_left.setText("$ns seats avaliable")
            id = bundle.getInt("pos")
        }

        if(ns == 0){
            button_buy_tickets.isEnabled = false
        }
        else {
            button_buy_tickets.setOnClickListener{
                val intent: Intent = Intent (this, SeleccionTicket::class.java)
                intent.putExtra("id", id)
                intent.putExtra("name", title)

            }
        }

    }
}