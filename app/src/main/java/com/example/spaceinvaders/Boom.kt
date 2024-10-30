package com.example.spaceinvaders

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory

class Boom {
    var x = 0
    var y = 0
    var bitmap : Bitmap

    constructor(context: Context, width: Int, height: Int) {
        bitmap = BitmapFactory.decodeResource(context.resources, R.drawable.boom)

        x = -300
        y = -300
    }
}