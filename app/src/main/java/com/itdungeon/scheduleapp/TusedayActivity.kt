package com.itdungeon.scheduleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TextView
import androidx.core.view.isVisible

class TusedayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tuesday)

        val mondayButton:Button = findViewById(R.id.button13)
        val wednesdayButton:Button = findViewById(R.id.button15)
        val thursdayButton:Button = findViewById(R.id.button16)
        val fridayButton:Button = findViewById(R.id.button17)

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

        val thirdLesson: TableLayout = findViewById(R.id.tableLayout3)

        firstLessonStartTime.setBackgroundResource(R.color.practic)
        firstLessonStartTime.text = "13:30"
        firstLessonName.text = "Операционные системы"
        firstLessonEndTime.setBackgroundResource(R.color.practic)
        firstLessonEndTime.text = "15:05"
        firstLessonType.text = "Практика"
        firstLessonCabinet.setBackgroundResource(R.color.practic)
        firstLessonCabinet.text = "Ауд. 2220"
        firstLessonTeacher.text = "Стуколов С.В."

        secondLessonStartTime.text = "15:30"
        secondLessonName.text = "Алгебра и геометрия"
        secondLessonEndTime.text = "17:05"
        secondLessonType.text = "Лекция"
        secondLessonCabinet.text = "Ауд. 2226"
        secondLessonTeacher.text = "Медведев А.В."

        thirdLessonStartTime.text = "17:15"
        thirdLessonName.text = "Математический анализ"
        thirdLessonEndTime.text = "18:50"
        thirdLessonType.text = "Лекция"
        thirdLessonCabinet.text = "Ауд. 2226"
        thirdLessonTeacher.text = "Чуешев А.В."


        thirdLesson.isVisible = true

        val groupSwitch:androidx.appcompat.widget.SwitchCompat = findViewById(R.id.switch2)

        mondayButton.setOnClickListener {
            val intent = Intent(this, MondayActivity::class.java)
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

        groupSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                firstLessonStartTime.setBackgroundResource(R.color.lection)
                firstLessonStartTime.text = "15:30"
                firstLessonName.text = "Алгебра и геометрия"
                firstLessonEndTime.setBackgroundResource(R.color.lection)
                firstLessonEndTime.text = "17:05"
                firstLessonType.text = "Лекция"
                firstLessonCabinet.setBackgroundResource(R.color.lection)
                firstLessonCabinet.text = "Ауд. 2226"
                firstLessonTeacher.text = "Медведев А.В."

                secondLessonStartTime.text = "17:15"
                secondLessonName.text = "Математический анализ"
                secondLessonEndTime.text = "18:50"
                secondLessonType.text = "Лекция"
                secondLessonCabinet.text = "Ауд. 2226"
                secondLessonTeacher.text = "Чуешев А.В."

                thirdLesson.isVisible = false
            }else{
                firstLessonStartTime.setBackgroundResource(R.color.practic)
                firstLessonStartTime.text = "13:30"
                firstLessonName.text = "Операционные системы"
                firstLessonEndTime.setBackgroundResource(R.color.practic)
                firstLessonEndTime.text = "15:05"
                firstLessonType.text = "Практика"
                firstLessonCabinet.setBackgroundResource(R.color.practic)
                firstLessonCabinet.text = "Ауд. 2220"
                firstLessonTeacher.text = "Стуколов С.В."

                secondLessonStartTime.text = "15:30"
                secondLessonName.text = "Алгебра и геометрия"
                secondLessonEndTime.text = "17:05"
                secondLessonType.text = "Лекция"
                secondLessonCabinet.text = "Ауд. 2226"
                secondLessonTeacher.text = "Медведев А.В."

                thirdLessonStartTime.text = "17:15"
                thirdLessonName.text = "Математический анализ"
                thirdLessonEndTime.text = "18:50"
                thirdLessonType.text = "Лекция"
                thirdLessonCabinet.text = "Ауд. 2226"
                thirdLessonTeacher.text = "Чуешев А.В."

                thirdLesson.isVisible = true
            }
        }
    }
}