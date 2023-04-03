package com.example.projectmvvmroom.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Personal(
    @PrimaryKey(autoGenerate = true)
    val idEmpemando:Long,
    var number:Int,
    var name:String,
    var surname:String,
    var email:String,
    var password:Int
)
