package com.jvhp.app6_shortbio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Formacao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formacao)
        lateinit var btnVoltar: Button

        btnVoltar = findViewById(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            val Voltar2 = Intent(
                this@Formacao,
                MainActivity::class.java
            )
            startActivity(Voltar2)
        }

    }
}