package mx.tecnm.tepic.ladm_u2_practica1_coposdenieve_darien_rafael_marquez_vazquez

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class lienzo(este: MainActivity): View(este) {
    val este =este
    val copos = Array<nieve>(500,{ nieve(this) })
    val copos2 = Array<nieve2>(300,{ nieve2(this) })
    val coroutine = GlobalScope.launch {
        while (true){
            este.runOnUiThread{
                invalidate()
            }
            delay(20L)
        }
    }
    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        val color = Color.BLACK
        c.drawColor(color)
        p.textSize = 50f
        p.color = Color.rgb(255,215,0)
        c.drawText("Feliz", 100f,120f,p)
        p.color = Color.RED
        c.drawText("Navidad", 150f,180f,p)


        p.color = Color.DKGRAY
        este.setTitle("ancho${width} alto${height}")
        c.drawRect(100f,960f,400f,1160f,p)

        p.color = Color.GREEN
        c.drawCircle(0f,1431f,500f,p)
        p.color = Color.rgb(0,150,100)
        c.drawCircle(720f,1431f,250f,p)

        p.style = Paint.Style.FILL_AND_STROKE
        p.strokeWidth = 10f
        p.color = Color.LTGRAY
        c.drawRect(5f,960f,175f,850f,p)
        p.color = Color.YELLOW
        c.drawRect(66f,870f,112f,850f,p)

        p.color = Color.rgb(114,92,66)
        c.drawRect(578f,1287f,650f,1521f,p)
        //canvas.drawRect( Rect(startX, topY, endX, bottomY), paint)
        p.color = Color.rgb(45, 90, 39)
        c.drawCircle(640f,1255f,30f,p)
        c.drawCircle(599f,1240f,30f,p)
        p.color = Color.rgb(50, 95, 45)
        c.drawCircle(620f,1260f,29f,p)
        p.color = Color.BLUE
        c.drawCircle(560f,1265f,25f,p)
        p.color = Color.RED
        c.drawCircle(600f,1265f,27f,p)

        p.color = Color.rgb(114,92,66)
        c.drawRect(100f,1450f,179f,1200f,p)
        //canvas.drawRect( Rect(startX, topY, endX, bottomY), paint)
        p.color = Color.rgb(45, 90, 39)
        c.drawCircle(140f,1205f,30f,p)
        c.drawCircle(130f,1280f,30f,p)
        p.color = Color.rgb(50, 95, 45)
        c.drawCircle(120f,1200f,29f,p)
        p.color = Color.BLUE
        c.drawCircle(160f,1205f,25f,p)
        p.color = Color.RED
        c.drawCircle(100f,1205f,27f,p)


        p.color = Color.WHITE
        c.drawCircle(520f,458f,50f,p)
        for (copitos in copos){
            copitos.mover()
            copitos.pintar(c)
        }
        for (copitos2 in copos2){
            copitos2.mover2()
            copitos2.pintar2(c)
        }
    }

}