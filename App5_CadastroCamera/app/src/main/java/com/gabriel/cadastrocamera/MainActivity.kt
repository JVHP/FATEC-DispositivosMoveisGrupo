package com.gabriel.cadastrocamera

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.drawToBitmap

lateinit var botaoTirarFoto: Button
lateinit var foto: ImageView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaoTirarFoto = findViewById(R.id.button)
        foto = findViewById(R.id.imagem)

        botaoTirarFoto.setOnClickListener {
            abrirCamera()
        }
    }


    fun abrirCamera(){
        val camera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        if(camera.resolveActivity(packageManager) != null){
            startActivityForResult(camera, 12345)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 12345 && resultCode == RESULT_OK){
            val fotoTirada = data?.extras?.get("data") as Bitmap
            foto.setImageBitmap(fotoTirada)
        }
    }



}