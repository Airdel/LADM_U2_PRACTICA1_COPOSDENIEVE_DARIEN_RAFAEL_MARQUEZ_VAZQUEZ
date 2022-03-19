package mx.tecnm.tepic.ladm_u2_ejercicio7_coroutinescanvas

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import mx.tecnm.tepic.ladm_u2_practica1_coposdenieve_darien_rafael_marquez_vazquez.lienzo
import kotlin.random.Random

class nieve(l: lienzo) {
    var tamanobola =rand(10)
    val l = l
    var x= 0f
    var y= 0f
    var movX =0f
    var movY =0f
    var color = Color.WHITE


    init{
        x= rand(700)
        y= rand(1300)
        movX = rand(6)+2
        movY = rand(6)+2

        if (rand(100)<50f){
            movX*=-1
        }
        if(rand(100)<50f){
            movY*=-1
        }

        color =Color.WHITE

    }

    private fun rand(hasta:Int):Float{
        return Random.nextInt(hasta).toFloat()
    }

    fun mover(){

        y+=(rand(3))
        movY--
        if(x<tamanobola ||x>l.width-tamanobola){
            movX*=-1
        }
        if (y<tamanobola || y>l.height-tamanobola){
            movY--
        }
        if (y>l.height){
            y= 0F
        }
    }

    fun pintar(canvas :Canvas){
        var p = Paint()
        p.color = color
        canvas.drawCircle(x,y,tamanobola.toFloat(),p)
    }

}