package com.oldfredddy.roomphonebook

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Person::class), version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun personDao():PersonDao
}