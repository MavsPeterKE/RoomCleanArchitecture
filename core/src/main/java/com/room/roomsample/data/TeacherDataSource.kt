package com.room.roomsample.data

import com.room.roomsample.domain.Teacher

interface TeacherDataSource {
    fun getAllTeachers(): List<Teacher>
    fun getTotalFeesPaid(): Double
    fun addTeacher(teacher: Teacher)
    fun deleteTeacher(teacher: Teacher)
}