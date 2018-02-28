package com.example.kevinpedroza.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

class activity_tablero : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablero)
    }

    fun closeIntent(v: View)
    {
        finish()
    }

    fun ir_ppal(v: View) {
        val intent1 = Intent(this, MainActivity::class.java).apply {  }
        startActivity(intent1)
    }
    

}
