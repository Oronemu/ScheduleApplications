package com.itdungeon.scheduleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wed)

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

        firstLessonStartTime.text = "11:45"
        firstLessonName.text = "Операционные системы"
        firstLessonEndTime.text = "13:20"
        firstLessonType.text = "Лекция"
        firstLessonCabinet.text = "Ауд. 5 бл."
        firstLessonTeacher.text = "Рейн Т.С."

        secondLessonStartTime.text = "13:30"
        secondLessonName.text = "Языки программирования"
        secondLessonEndTime.text = "15:05"
        secondLessonType.text = "Лекция"
        secondLessonCabinet.text = "Ауд. 5 бл."
        secondLessonTeacher.text = "Иванов К.С."

        thirdLessonStartTime.text = "15:30"
        thirdLessonName.text = "Дискретная математика"
        thirdLessonEndTime.text = "17:05"
        thirdLessonType.text = "Лекция"
        thirdLessonCabinet.text = "Ауд. 5 бл."
        thirdLessonTeacher.text = "Гутова С.Г."

        val weekSwitch:androidx.appcompat.widget.SwitchCompat = findViewById(R.id.switch1)

        mondayButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        tuesdayButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        thursdayButton.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        fridayButton.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }

        weekSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                firstLessonStartTime.text = "11:45"
                firstLessonName.text = "Операционные системы"
                firstLessonEndTime.text = "13:20"
                firstLessonType.text = "Лекция"
                firstLessonCabinet.text = "Ауд. 5 бл."
                firstLessonTeacher.text = "Рейн Т.С."

                secondLessonStartTime.text = "13:30"
                secondLessonName.text = "Языки программирования"
                secondLessonEndTime.text = "15:05"
                secondLessonType.text = "Лекция"
                secondLessonCabinet.text = "Ауд. 5 бл."
                secondLessonTeacher.text = "Иванов К.С."

                thirdLessonStartTime.text = "15:30"
                thirdLessonName.text = "ОБЖ"
                thirdLessonEndTime.text = "17:05"
                thirdLessonType.text = "Лекция"
                thirdLessonCabinet.text = "Ауд. 2 бл."
                thirdLessonTeacher.text = "Ефимов Д.А."

            }else{
                firstLessonStartTime.text = "11:45"
                firstLessonName.text = "Операционные системы"
                firstLessonEndTime.text = "13:20"
                firstLessonType.text = "Лекция"
                firstLessonCabinet.text = "Ауд. 5 бл."
                firstLessonTeacher.text = "Рейн Т.С."

                secondLessonStartTime.text = "13:30"
                secondLessonName.text = "Языки программирования"
                secondLessonEndTime.text = "15:05"
                secondLessonType.text = "Лекция"
                secondLessonCabinet.text = "Ауд. 5 бл."
                secondLessonTeacher.text = "Иванов К.С."

                thirdLessonStartTime.text = "15:30"
                thirdLessonName.text = "Дискретная математика"
                thirdLessonEndTime.text = "17:05"
                thirdLessonType.text = "Лекция"
                thirdLessonCabinet.text = "Ауд. 5 бл."
                thirdLessonTeacher.text = "Гутова С.Г."
            }
        }

    }
}