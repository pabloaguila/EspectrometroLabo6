package com.example.calibrarlongituddeonda

import kotlin.math.pow

class RegresionLineal {
    fun linRegressInt(x: ArrayList<Int>, y: ArrayList<Int>): FloatArray {
        var avgY = 0.0f
        var avgX = 0.0f
        var covXY = 0.0f
        var varX = 0.0f

        for (i in 0..x.size-1) {
            avgY += y[i]
            avgX += x[i]
        }

        avgX = avgX/(x.size)
        avgY = avgY/(x.size)

        for (i in 0..x.size-1) {
            covXY += (y[i] - avgY)*(x[i] - avgX)
            varX += (x[i]-avgX).pow(2)
        }

        val p = FloatArray(2)
        p[0] = covXY/varX
        p[1] = avgY - p[0]*avgX

        return p
    }
}