package com.example.projectnotes_mcslecturer

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.notesproject_mcs.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val taskList = findViewById<LinearLayout>(R.id.taskList)
        val addTaskButton = findViewById<Button>(R.id.btnAddTask)

        val tasks = listOf(
            "Meeting with Client - 10:00 AM",
            "UI Design Review - 1:00 PM",
            "Development Session - 3:00 PM"
        )

        for (task in tasks) {
            val taskView = TextView(this)
            taskView.text = task
            taskView.textSize = 16f
            taskView.setPadding(0, 8, 0, 8)
            taskList.addView(taskView)
        }

        addTaskButton.setOnClickListener {
            // TODO: Intent ke AddScheduleActivity nanti
        }
    }
}
