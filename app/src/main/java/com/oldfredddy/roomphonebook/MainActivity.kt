package com.oldfredddy.roomphonebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oldfredddy.roomphonebook.App.Companion.database
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = database?.personDao()
        val newPerson = Person(null, "Александр Ревва", 89281485584)

        GlobalScope.launch {
            db?.insert(newPerson)
            val personList: List<Person> = db?.getAll()!!
            withContext(Dispatchers.Main) {
                tvPerson.text = personList.size.toString()
                delay(5000)
                tvPerson.text = personList[0].id.toString()
            }

        }

    }
}