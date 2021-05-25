package com.itdungeon.scheduleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.Switch
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val firstLessonStartTime:TextView = findViewById(R.id.textView1)
        val firstLessonName:TextView = findViewById(R.id.textView2)
        val firstLessonEndTime:TextView = findViewById(R.id.textView3)
        val firstLessonType:TextView = findViewById(R.id.textView4)
        val firstLessonCabinet:TextView = findViewById(R.id.textView5)
        val firstLessonTeacher:TextView = findViewById(R.id.textView6)

        val secondLessonStartTime:TextView = findViewById(R.id.textView7)
        val secondLessonName:TextView = findViewById(R.id.textView8)
        val secondLessonEndTime:TextView = findViewById(R.id.textView9)
        val secondLessonType:TextView = findViewById(R.id.textView10)
        val secondLessonCabinet:TextView = findViewById(R.id.textView11)
        val secondLessonTeacher:TextView = findViewById(R.id.textView12)

        val thirdLessonStartTime:TextView = findViewById(R.id.textView13)
        val thirdLessonName:TextView = findViewById(R.id.textView14)
        val thirdLessonEndTime:TextView = findViewById(R.id.textView15)
        val thirdLessonType:TextView = findViewById(R.id.textView16)
        val thirdLessonCabinet:TextView = findViewById(R.id.textView17)
        val thirdLessonTeacher:TextView = findViewById(R.id.textView18)

        val fourthLessonStartTime:TextView = findViewById(R.id.textView19)
        val fourthLessonName:TextView = findViewById(R.id.textView20)
        val fourthLessonEndTime:TextView = findViewById(R.id.textView21)
        val fourthLessonType:TextView = findViewById(R.id.textView22)
        val fourthLessonCabinet:TextView = findViewById(R.id.textView23)
        val fourthLessonTeacher:TextView = findViewById(R.id.textView24)

        val mondayButton:Button = findViewById(R.id.button13)
        val thuButton:Button = findViewById(R.id.button14)


        mondayButton.setOnClickListener{
            firstLessonStartTime.text = "9:45"
            firstLessonName.text = "ОБЖ"
            firstLessonEndTime.text = "11:45"
            firstLessonType.text = "Практика"
            firstLessonCabinet.text = "Ауд. 5119"
            firstLessonTeacher.text = "Ефимов Д.А."
        }

        thuButton.setOnClickListener{
            firstLessonStartTime.text = "15.30"
        }
    }

}

