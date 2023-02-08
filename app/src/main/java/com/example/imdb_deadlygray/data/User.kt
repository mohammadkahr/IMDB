package com.example.imdb_deadlygray.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "UserTable")
data class User(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "UserId")
    val id: Int ,

    @ColumnInfo(name = "UserName")
    val name: String ,

    @ColumnInfo(name = "UserPassword")
    val password: String
    )

