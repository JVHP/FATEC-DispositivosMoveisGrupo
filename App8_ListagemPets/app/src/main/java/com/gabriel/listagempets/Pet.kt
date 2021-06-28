package com.gabriel.listagempets

import android.graphics.drawable.Drawable

data class Pet(
    var foto: Drawable?=null,
    var nome: String,
    var raca: Raca,
    var sexo: Sexo
)

