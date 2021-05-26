package com.itdungeon.scheduleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.th)

        val mondayButton: Button = findViewById(R.id.button13)
        val tuesdayButton: Button = findViewById(R.id.button14)
        val wednesdayButton: Button = findViewById(R.id.button15)
        val thursdayButton: Button = findViewById(R.id.button16)
        val fridayButton: Button = findViewById(R.id.button17)

        val firstLessonStartTime: TextView = findViewById(R.id.textView1)
        val firstLessonName: TextView = findViewById(R.id.textView2)
        val firstLessonEndTime: TextView = findViewById(R.id.textView3)
        val firstLessonType: TextView = findViewById(R.id.textView4)
        val firstLessonCabinet: TextView = findViewById(R.id.textView5)
        val firstLessonTeacher: TextView = findViewById(R.id.textView6)

        val secondLessonStartTime: TextView = findViewById(R.id.textView7)
        val secondLessonName: TextView = findViewById(R.id.textView8)
        val secondLessonEndTime: TextView = findViewById(R.id.textView9)
        val secondLessonType: TextView = findViewById(R.id.textView10)
        val secondLessonCabinet: TextView = findViewById(R.id.textView11)
        val secondLessonTeacher: TextView = findViewById(R.id.textView12)

        val thirdLessonStartTime: TextView = findViewById(R.id.textView13)
        val thirdLessonName: TextView = findViewById(R.id.textView14)
        val thirdLessonEndTime: TextView = findViewById(R.id.textView15)
        val thirdLessonType: TextView = findViewById(R.id.textView16)
        val thirdLessonCabinet: TextView = findViewById(R.id.textView17)
        val thirdLessonTeacher: TextView = findViewById(R.id.textView18)

        val thirdLesson:TableLayout = findViewById(R.id.tableLayout3)

        firstLessonStartTime.text = "11:45"
        firstLessonName.text = "Математический анализ"
        firstLessonEndTime.text = "13:20"
        firstLessonType.text = "Практика"
        firstLessonCabinet.text = "Ауд. 5204"
        firstLessonTeacher.text = "Чуешев А.В."

        secondLessonStartTime.text = "13:30"
        secondLessonName.text = "Ф-ра"
        secondLessonEndTime.text = "15:05"
        secondLessonType.text = "Практика"
        secondLessonCabinet.text = "Ауд. тир"
        secondLessonTeacher.text = "Тюкалова С.А."

        thirdLesson.isVisible = false

        val weekSwitch:androidx.appcompat.widget.SwitchCompat = findViewById(R.id.switch1)

        mondayButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        tuesdayButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        wednesdayButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        fridayButton.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }

        weekSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                firstLessonStartTime.text = "8:00"
                firstLessonName.text = "Учебная практика"
                firstLessonEndTime.text = "9:35"
                firstLessonType.text = "Практика"
                firstLessonCabinet.text = "Ауд. 2141"
                firstLessonTeacher.text = "Иванов К.С."

                secondLessonStartTime.text = "9:45"
                secondLessonName.text = "Учебная практика"
                secondLessonEndTime.text = "22:20"
                secondLessonType.text = "Практика"
                secondLessonCabinet.text = "Ауд. 2141"
                secondLessonTeacher.text = "Иванов К.С."

                thirdLessonStartTime.text = "11:45"
                thirdLessonName.text = "Математический анализ"
                thirdLessonEndTime.text = "13:20"
                thirdLessonType.text = "Практика"
                thirdLessonCabinet.text = "Ауд. 5204"
                thirdLessonTeacher.text = "Чуешев А.В."

                thirdLesson.isVisible = true
            }else{
                firstLessonStartTime.text = "11:45"
                firstLessonName.text = "Математический анализ"
                firstLessonEndTime.text = "13:20"
                firstLessonType.text = "Практика"
                firstLessonCabinet.text = "Ауд. 5204"
                firstLessonTeacher.text = "Чуешев А.В."

                secondLessonStartTime.text = "13:30"
                secondLessonName.text = "Ф-ра"
                secondLessonEndTime.text = "15:05"
                secondLessonType.text = "Практика"
                secondLessonCabinet.text = "Ауд. тир"
                secondLessonTeacher.text = "Тюкалова С.А."

                thirdLesson.isVisible = false
            }
        }
    }
}