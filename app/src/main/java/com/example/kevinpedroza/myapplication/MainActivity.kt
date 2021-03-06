package com.example.kevinpedroza.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //Clase bundle facilita que al rotar el telefono no se pierdan los datos de la actividad vertical a la horizontal
        super.onCreate(savedInstanceState)
        //La clase R se crea por default, la cual permite obtener los recursos (resource) para usarlos en el Layout. De Layout invocamos el archivo activity_main.xml
        setContentView(R.layout.activity_main)

    }

    fun ir_jugar(v: View) {
        val intent1 = Intent(this, activity_jugar::class.java).apply {}
        startActivity(intent1)
    }
}
