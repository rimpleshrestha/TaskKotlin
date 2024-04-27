package com.example.task

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TaskTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_task_two)

        val spinnerId=findViewById<Spinner>(R.id.spinId)
        val colors= arrayOf("state of grace","Red","1989","TS")
        val arrayAdp=ArrayAdapter(this@TaskTwo,android.R.layout.simple_spinner_dropdown_item,colors)
        spinnerId.adapter=arrayAdp

        spinnerId?.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0:AdapterView<*>?,p1:View?,p2:Int,p3:Long){
                Toast.makeText(this@TaskTwo,"item is ${colors[p2]}",Toast.LENGTH_LONG).show()
            }

        }

    }
}