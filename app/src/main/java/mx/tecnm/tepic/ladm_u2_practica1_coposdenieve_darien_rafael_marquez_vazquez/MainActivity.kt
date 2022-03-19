package mx.tecnm.tepic.ladm_u2_practica1_coposdenieve_darien_rafael_marquez_vazquez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(lienzo(this))
    }
}