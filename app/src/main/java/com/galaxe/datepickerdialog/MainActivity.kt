package com.galaxe.datepickerdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var datePick : DatePicker
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        datePick = findViewById(R.id.dp)
        var today = Calendar.getInstance()
        datePick.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH))
        {view, year, month, day ->
            var month = month + 1
            var msg = "You have selected $day/$month/$year"

            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

        }
    }


}