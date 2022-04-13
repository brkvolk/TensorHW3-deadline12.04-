package com.example.employee

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EmployeeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.employee_card)

        findViewById<Button>(R.id.back_to_menu).setOnClickListener{
            onBackPressed()
        }
        findViewById<Button>(R.id.call).setOnClickListener {
            val toast = Toast.makeText(applicationContext, "что-то происходит и я звоню", Toast.LENGTH_LONG)
            toast.show()
        }
        findViewById<Button>(R.id.message).setOnClickListener {
            val toast = Toast.makeText(applicationContext, "что-то происходит и я пишу сообщение", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}