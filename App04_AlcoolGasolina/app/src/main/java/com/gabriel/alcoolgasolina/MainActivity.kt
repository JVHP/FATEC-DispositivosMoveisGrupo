package com.gabriel.alcoolgasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

lateinit var res: TextView
lateinit var botao: Button
var alc: Double? = null
var gas: Double? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        res = findViewById(R.id.textView4)
        botao = findViewById(R.id.button)

        botao.setOnClickListener{
            alc = findViewById<TextView>(R.id.alcool).text.toString().toDoubleOrNull()
            gas = findViewById<TextView>(R.id.gasolina).text.toString().toDoubleOrNull()
            AlcoolGasolina()
        }

    }

    fun AlcoolGasolina(){
        var exibir = ""

        gas?.let{
            alc?.let{
                var calcular = it /gas!!

                if(calcular < 0.7){
                    exibir = "Melhor utilizar álcool!"
                }else{
                    exibir = "Melhor utilizar gasolina!"
                }
            }
        }

        res.text = exibir

    }

}