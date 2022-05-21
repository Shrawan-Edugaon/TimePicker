package com.example.timepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val time = findViewById<TimePicker>(R.id.timePicker) as TimePicker

        time.setOnTimeChangedListener({view,hourOfDay,minute->
            Toast.makeText(this@MainActivity,"Time:-$hourOfDay:$minute",Toast.LENGTH_SHORT).show()
        })
    }
}