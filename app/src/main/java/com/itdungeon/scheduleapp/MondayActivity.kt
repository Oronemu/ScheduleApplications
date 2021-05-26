package com.itdungeon.scheduleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MondayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.monday)

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

        firstLessonStartTime.text = "9:45"
        firstLessonName.text = "ОБЖ"
        firstLessonEndTime.text = "11:20"
        firstLessonType.text = "Практика"
        firstLessonCabinet.text = "Ауд. 5119"
        firstLessonTeacher.text = "Ефимов Д.А."

        secondLessonStartTime.text = "11:45"
        secondLessonName.text = "Ф-ра"
        secondLessonEndTime.text = "13:20"
        secondLessonType.text = "Практика"
        secondLessonCabinet.text = "Ауд. тир"
        secondLessonTeacher.text = "Тюкалова С.А."

        thirdLessonStartTime.text = "13:30"
        thirdLessonName.text = "Дискретная математика"
        thirdLessonEndTime.text = "15:05"
        thirdLessonType.text = "Практика"
        thirdLessonCabinet.text = "Ауд. 5106"
        thirdLessonTeacher.text = "Гутова С.Г."

        fourthLessonStartTime.text = "15:30"
        fourthLessonName.text = "Алгебра и геометрия"
        fourthLessonEndTime.text = "17:05"
        fourthLessonType.text = "Практика"
        fourthLessonCabinet.text = "Ауд. 5106"
        fourthLessonTeacher.text = "Медведев А.В."

        val tuesdayButton:Button = findViewById(R.id.button14)
        val wednesdayButton:Button = findViewById(R.id.button15)
        val thursdayButton:Button = findViewById(R.id.button16)
        val fridayButton:Button = findViewById(R.id.button17)

        tuesdayButton.setOnClickListener {
            val intent = Intent(this, TusedayActivity::class.java)
            startActivity(intent)
        }

        wednesdayButton.setOnClickListener {
            val intent = Intent(this, WednesdayActivity::class.java)
            startActivity(intent)
        }

        thursdayButton.setOnClickListener {
            val intent = Intent(this, ThursdayActivity::class.java)
            startActivity(intent)
        }

        fridayButton.setOnClickListener {
            val intent = Intent(this, FridayActivity::class.java)
            startActivity(intent)
        }

    }
}

