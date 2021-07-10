package com.gabriel.listagempets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvPets)

        val lista = mutableListOf<Pet>(
            Pet(nome="Thommy", raca= Raca.PASSARO, sexo= Sexo.MACHO, foto=resources.getDrawable(R.drawable.papagaio)),
            Pet(nome="Pitty", raca= Raca.CACHORRO, sexo= Sexo.MACHO, foto=resources.getDrawable(R.drawable.cachorro)),
            Pet(nome="Jujuba", raca= Raca.GATO, sexo = Sexo.FEMEA, foto=resources.getDrawable(R.drawable.gato)),
            Pet(nome="Thor", raca= Raca.CACHORRO, sexo= Sexo.MACHO, foto=resources.getDrawable(R.drawable.cachorro2))
        )

        rv.adapter = PetAdapter(lista)
        rv.layoutManager = LinearLayoutManager(this)


    }
}
