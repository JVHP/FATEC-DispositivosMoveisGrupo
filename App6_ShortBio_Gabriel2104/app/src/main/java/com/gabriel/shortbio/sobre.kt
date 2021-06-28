package com.gabriel.shortbio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sobre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)


        lateinit var botaoVoltar: Button
        botaoVoltar = findViewById(R.id.voltar)

        botaoVoltar.setOnClickListener{
            val voltar = Intent(this@sobre, MainActivity::class.java)
            startActivity(voltar)
        }

    }
}