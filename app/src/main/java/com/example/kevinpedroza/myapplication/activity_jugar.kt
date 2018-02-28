package com.example.kevinpedroza.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

class activity_jugar : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jugar)
    }

    fun closeIntent(v: View)
    {
        finish()
    }

    fun ir_tablero(v: View) {
        val intent1 = Intent(this, activity_tablero::class.java).apply {  }
        startActivity(intent1)
    }
}
