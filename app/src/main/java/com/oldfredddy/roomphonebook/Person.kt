package com.oldfredddy.roomphonebook

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Person(
    @PrimaryKey(autoGenerate = true)
    val id: Long?,

    val name: String,

    val phoneNumber: Long

)

