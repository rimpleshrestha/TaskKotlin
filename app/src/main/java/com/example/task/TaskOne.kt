package com.example.task

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class TaskOne : AppCompatActivity() , OnClickListener {
    lateinit var editTextName: EditText
    lateinit var buttonClickMe: Button
    lateinit var textViewMessage:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_task1)

        editTextName=findViewById(R.id.editTextName)
        buttonClickMe=findViewById(R.id.buttonClickMe)
        textViewMessage=findViewById(R.id.textViewMessage)

        buttonClickMe.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val name= editTextName.text
        textViewMessage.text="Hello $name"

    }
}
