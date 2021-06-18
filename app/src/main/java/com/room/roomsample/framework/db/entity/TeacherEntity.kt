package com.room.roomsample.framework.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "teachers_table")
data class TeacherEntity(
    @PrimaryKey() @ColumnInfo(name = "teacher_id")
    val id: Int,
    @ColumnInfo(name = "teacher_name")
    val name: String,
    @ColumnInfo(name = "teacher_role")
    val designation: Int,
    @ColumnInfo(name = "assigned_Class")
    val assignedClass: String,
)
