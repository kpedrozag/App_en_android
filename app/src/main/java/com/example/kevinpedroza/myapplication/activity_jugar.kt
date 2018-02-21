package com.example.kevinpedroza.myapplication

import android.app.Activity
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
}
