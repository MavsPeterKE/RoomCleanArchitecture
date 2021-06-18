package com.room.roomsample.framework.db.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students_table")
data class StudentEntity(
    @PrimaryKey @NonNull @ColumnInfo(name = "admission_no")
    val admissionNo: String,
    @ColumnInfo(name = "student_name")
    val name: String,
    @ColumnInfo(name = "student_age")
    val age: Int,
    @ColumnInfo(name = "class")
    val studentClass: String,
    @ColumnInfo(name = "teacherId")
    val teacherId: String
)
