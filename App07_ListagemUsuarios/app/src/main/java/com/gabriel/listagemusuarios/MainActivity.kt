package com.gabriel.listagemusuarios

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvUsuarios)

        val lista = mutableListOf<Usuario>(
            Usuario(nome="Lionel Messi", email="messi@gmail.com", stack= Stack.FULLSTACK, senioridade= Senioridade.SENIOR, foto=resources.getDrawable(R.drawable.messi)),
            Usuario(nome="Cristiano Ronaldo", email="cr7@gmail.com", stack= Stack.FRONTEND, senioridade= Senioridade.PLENO, foto=resources.getDrawable(R.drawable.cr7)),
            Usuario(nome="Neymar", email="neymar@gmail.com", stack= Stack.BACKEND, senioridade= Senioridade.JUNIOR, foto=resources.getDrawable(R.drawable.neymar)),
            Usuario(nome="Robert Lewandowski", email="lewa@gmail.com", stack= Stack.FRONTEND, senioridade= Senioridade.SENIOR, foto=resources.getDrawable(R.drawable.lewa))
            )

        rv.adapter = UsuarioAdapter(lista)
        rv.layoutManager = LinearLayoutManager(this)

    }
}
