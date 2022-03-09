package com.example.popcorn_207003

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class SeleccionTicket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_ticket)

        val titulo: TextView = findViewById(R.id.title_seats)
        var posicion = -1
        var bundle = intent.extras

        if(bundle !=null){
                titulo.setText(bundle.getString("titulo"))
                posicion = bundle.getInt("id")
        }

        val confirmar: Button = findViewById(R.id.botonConfirmacion)

        confirmar.setOnClickListener{

            //por
            Toast.makeText(this, "Disfruta "+titulo+"!",Toast.LENGTH_LONG).show()
        }

        val row1: RadioGroup = findViewById(R.id.row2)
        val row2: RadioGroup = findViewById(R.id.row3)
        val row3: RadioGroup = findViewById(R.id.row4)
        val row4: RadioGroup = findViewById(R.id.row5)

        row1.setOnCheckedChangeListener{group, checkedID ->

            if(checkedID > -1){
                row2.clearCheck()
                row3.clearCheck()
                row4.clearCheck()
                row1.check(checkedID)

            }

        }
        row2.setOnCheckedChangeListener{group, checkedID ->

            if(checkedID > -1){
                row1.clearCheck()
                row3.clearCheck()
                row4.clearCheck()
                row2.check(checkedID)

            }

        }
        row3.setOnCheckedChangeListener{group, checkedID ->

            if(checkedID > -1){
                row2.clearCheck()
                row1.clearCheck()
                row4.clearCheck()
                row3.check(checkedID)

            }

        }
        row4.setOnCheckedChangeListener{group, checkedID ->

            if(checkedID > -1){
                row2.clearCheck()
                row3.clearCheck()
                row1.clearCheck()
                row4.check(checkedID)

            }

        }
    }
}