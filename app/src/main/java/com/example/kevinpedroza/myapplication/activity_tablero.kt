package com.example.kevinpedroza.myapplication

import android.app.Activity
import android.os.Bundle
import android.view.View

class activity_tablero : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablero)
    }
    class boton (val v: View, val x: Int, val y: Int){

    }

    

}
