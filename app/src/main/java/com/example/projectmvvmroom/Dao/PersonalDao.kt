package com.example.projectmvvmroom.Dao

import androidx.room.*
import com.example.projectmvvmroom.models.Personal

@Dao
interface PersonalDao {
    @Query("SELECT * FROM Personal")
    suspend fun getDao():List<Personal>
    @Insert( onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(person:Personal):List<Long>
    @Update()
    suspend fun update(person:Personal):Int
    @Delete()
    suspend fun delete(person: Personal):Int
}