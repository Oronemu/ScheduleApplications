package com.itdungeon.scheduleapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.Switch
import android.widget.TableLayout
import android.widget.TextView
import androidx.core.view.isVisible


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
        thirdLessonCabinet.text = "5106"
        thirdLessonTeacher.text = "Гутова С.Г."

        fourthLessonStartTime.text = "15:30"
        fourthLessonName.text = "Алгебра и геометрия"
        fourthLessonEndTime.text = "17:05"
        fourthLessonType.text = "Практика"
        fourthLessonCabinet.text = "5106"
        fourthLessonTeacher.text = "Медведев А.В."

        val thirdLesson:TableLayout = findViewById(R.id.tableLayout3)
        val fourthLesson:TableLayout = findViewById(R.id.tableLayout4)

        val mondayButton:Button = findViewById(R.id.button13)
        val tuesdayButton:Button = findViewById(R.id.button14)
        val wednesdayButton:Button = findViewById(R.id.button15)
        val thursdayButton:Button = findViewById(R.id.button16)
        val fridayButton:Button = findViewById(R.id.button17)


        val weekSwitch:androidx.appcompat.widget.SwitchCompat = findViewById(R.id.switch1)
        val groupSwitch:androidx.appcompat.widget.SwitchCompat = findViewById(R.id.switch2)

        tuesdayButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        wednesdayButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
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


        /*mondayButton.setOnClickListener{
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
            thirdLessonCabinet.text = "5106"
            thirdLessonTeacher.text = "Гутова С.Г."

            fourthLessonStartTime.text = "15:30"
            fourthLessonName.text = "Алгебра и геометрия"
            fourthLessonEndTime.text = "17:05"
            fourthLessonType.text = "Практика"
            fourthLessonCabinet.text = "5106"
            fourthLessonTeacher.text = "Медведев А.В."

            thirdLesson.isVisible = true
            fourthLesson.isVisible = true



            weekSwitch.setOnCheckedChangeListener { CompatSwitch, isChecked ->
                if (isChecked) {
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
                    thirdLessonCabinet.text = "5106"
                    thirdLessonTeacher.text = "Гутова С.Г."

                    fourthLessonStartTime.text = "15:30"
                    fourthLessonName.text = "Алгебра и геометрия"
                    fourthLessonEndTime.text = "17:05"
                    fourthLessonType.text = "Практика"
                    fourthLessonCabinet.text = "Ауд. 5106"
                    fourthLessonTeacher.text = "Медведев А.В."

                    thirdLesson.isVisible = true
                    fourthLesson.isVisible = true
                } else {
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
                    thirdLessonCabinet.text = "5106"
                    thirdLessonTeacher.text = "Гутова С.Г."

                    fourthLessonStartTime.text = "15:30"
                    fourthLessonName.text = "Алгебра и геометрия"
                    fourthLessonEndTime.text = "17:05"
                    fourthLessonType.text = "Практика"
                    fourthLessonCabinet.text = "Ауд. 5106"
                    fourthLessonTeacher.text = "Медведев А.В."

                    thirdLesson.isVisible = true
                    fourthLesson.isVisible = true
                }
            }
        }


        tuesdayButton.setOnClickListener{
            firstLessonStartTime.text = "13:30"
            firstLessonName.text = "Операционные системы"
            firstLessonEndTime.text = "15:05"
            firstLessonType.text = "Практика"
            firstLessonCabinet.text = "Ауд. 2226"
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
            fourthLesson.isVisible = false
            weekSwitch.setOnCheckedChangeListener { CompatSwitch, isChecked ->
                if (isChecked) {
                    firstLessonStartTime.text = "13:30"
                    firstLessonName.text = "Операционные системы"
                    firstLessonEndTime.text = "15:05"
                    firstLessonType.text = "Практика"
                    firstLessonCabinet.text = "Ауд. 2226"
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
                    fourthLesson.isVisible = false
                }else{
                    firstLessonStartTime.text = "13:30"
                    firstLessonName.text = "Операционные системы"
                    firstLessonEndTime.text = "15:05"
                    firstLessonType.text = "Практика"
                    firstLessonCabinet.text = "Ауд. 2226"
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
                    fourthLesson.isVisible = false
                }
            }
        }

        wednesdayButton.setOnClickListener{
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

            thirdLesson.isVisible = true
            fourthLesson.isVisible = false
            weekSwitch.setOnCheckedChangeListener { CompatSwitch, isChecked ->
                if (isChecked) {
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

                    thirdLesson.isVisible = true
                    fourthLesson.isVisible = false
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

                    thirdLesson.isVisible = true
                    fourthLesson.isVisible = false
                }
            }
        }

        thursdayButton.setOnClickListener{
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
            fourthLesson.isVisible = false
            weekSwitch.setOnCheckedChangeListener { CompatSwitch, isChecked ->
                if (isChecked) {
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
                    fourthLesson.isVisible = false
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
                    fourthLesson.isVisible = false
                }
            }
        }

        fridayButton.setOnClickListener {
            firstLessonStartTime.text = "11:45"
            firstLessonName.text = "Иностранный язык"
            firstLessonEndTime.text = "13:20"
            firstLessonType.text = "Практика"
            firstLessonCabinet.text = "Ауд. 2218"
            firstLessonTeacher.text = "Перевалова А.А."

            secondLessonStartTime.text = "13:30"
            secondLessonName.text = "Языки программирования"
            secondLessonEndTime.text = "15:05"
            secondLessonType.text = "Практика"
            secondLessonCabinet.text = "Ауд. 2220"
            secondLessonTeacher.text = "Иванов К.С."

            thirdLesson.isVisible = false
            fourthLesson.isVisible = false

            weekSwitch.setOnCheckedChangeListener { CompatSwitch, isChecked ->
                if (isChecked) {
                    firstLessonStartTime.text = "11:45"
                    firstLessonName.text = "Иностранный язык"
                    firstLessonEndTime.text = "13:20"
                    firstLessonType.text = "Практика"
                    firstLessonCabinet.text = "Ауд. 2218"
                    firstLessonTeacher.text = "Перевалова А.А."

                    secondLessonStartTime.text = "13:30"
                    secondLessonName.text = "Языки программирования"
                    secondLessonEndTime.text = "15:05"
                    secondLessonType.text = "Практика"
                    secondLessonCabinet.text = "Ауд. 2220"
                    secondLessonTeacher.text = "Иванов К.С."

                    thirdLesson.isVisible = false
                    fourthLesson.isVisible = false
                }else{
                    firstLessonStartTime.text = "11:45"
                    firstLessonName.text = "Иностранный язык"
                    firstLessonEndTime.text = "13:20"
                    firstLessonType.text = "Практика"
                    firstLessonCabinet.text = "Ауд. 2218"
                    firstLessonTeacher.text = "Перевалова А.А."

                    secondLessonStartTime.text = "13:30"
                    secondLessonName.text = "Языки программирования"
                    secondLessonEndTime.text = "15:05"
                    secondLessonType.text = "Практика"
                    secondLessonCabinet.text = "Ауд. 2220"
                    secondLessonTeacher.text = "Иванов К.С."

                    thirdLesson.isVisible = false
                    fourthLesson.isVisible = false
                }

                groupSwitch.setOnCheckedChangeListener { buttonView1, isChecked1 ->
                    if(isChecked1){
                        firstLessonStartTime.text = "9:45"
                        firstLessonName.text = "Иностранный язык"
                        firstLessonEndTime.text = "11:20"
                        firstLessonType.text = "Практика"
                        firstLessonCabinet.text = "Ауд. 2218"
                        firstLessonTeacher.text = "Перевалова А.А."

                        secondLessonStartTime.text = "11:45"
                        secondLessonName.text = "Языки программирования"
                        secondLessonEndTime.text = "13:20"
                        secondLessonType.text = "Практика"
                        secondLessonCabinet.text = "Ауд. 2220"
                        secondLessonTeacher.text = "Иванов К.С."

                        thirdLessonStartTime.text = "13:20"
                        thirdLessonName.text = "Операционные системы"
                        thirdLessonEndTime.text = "15:05"
                        thirdLessonType.text = "Практика"
                        thirdLessonCabinet.text = "Ауд. 2130Б"
                        thirdLessonTeacher.text = "Зимин А.И."

                        thirdLesson.isVisible = true
                        fourthLesson.isVisible = false
                    }else{
                        firstLessonStartTime.text = "11:45"
                        firstLessonName.text = "Иностранный язык"
                        firstLessonEndTime.text = "13:20"
                        firstLessonType.text = "Практика"
                        firstLessonCabinet.text = "Ауд. 2218"
                        firstLessonTeacher.text = "Перевалова А.А."

                        secondLessonStartTime.text = "13:30"
                        secondLessonName.text = "Языки программирования"
                        secondLessonEndTime.text = "15:05"
                        secondLessonType.text = "Практика"
                        secondLessonCabinet.text = "Ауд. 2220"
                        secondLessonTeacher.text = "Иванов К.С."

                        thirdLesson.isVisible = false
                        fourthLesson.isVisible = false


                    }
                }
            }
        }*/
    }
}

