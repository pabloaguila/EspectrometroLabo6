package com.example.calibrarlongituddeonda

import android.graphics.Bitmap
import android.graphics.Color
import org.json.JSONException
import org.json.JSONObject
import kotlin.math.pow

class Autorotar (myBitmap: Bitmap){

    private var alto = myBitmap.height
    private val ancho = myBitmap.width



    fun pendiente(myBitmap: Bitmap): FloatArray{
        var intensidad = FloatArray(ancho)
        var maximosI = arrayListOf<Float>()
        var maximosX = arrayListOf<Int>()
        var maximosY = arrayListOf<Int>()

        for(y in 0..alto-1) {
            var iteradorI = 0.0f
            var iteradorX = 0
            for (x in 0..ancho-1) {
                var argb = myBitmap.getPixel(x, y)
                intensidad[x] = (0.33 * (Color.red(argb) + Color.blue(argb) + Color.green(argb))).toFloat()
                if (intensidad[x] > iteradorI && intensidad[x] > 120/3) {
                    iteradorI = intensidad[x]
                    iteradorX = x
                }
            }

            if (iteradorI > 0) {
                maximosX.add(iteradorX)
                maximosY.add(y)
                maximosI.add(iteradorI)
            }
        }

        val regresionLineal = RegresionLineal()
        var m = regresionLineal.linRegressInt(maximosY, maximosX)
        println("m = ${m[0]}")
        println("b = ${m[1]}")
        return m
    }

    var m  = pendiente(myBitmap)

    var tita = 180*kotlin.math.atan(m[0])/3.1416f

}