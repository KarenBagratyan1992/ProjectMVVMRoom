package com.example.projectmvvmroom.models

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.projectmvvmroom.Dao.PersonalDao

@Database(
    entities = [Personal::class],
    version = 1)
abstract class DatabaseDB:RoomDatabase() {
    abstract fun personalDao():PersonalDao
}