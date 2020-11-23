package com.oldfredddy.roomphonebook

import androidx.room.*


@Dao
interface PersonDao {
    @Query("SELECT * FROM person")
    fun getAll(): List<Person>

    @Query("SELECT * FROM person WHERE id = :id")
    fun getById(id: Long): Person

    @Insert
    fun insert(person: Person)

    @Update
    fun update(person: Person)

    @Delete
    fun delete(person: Person)
}