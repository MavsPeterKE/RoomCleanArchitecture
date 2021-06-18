package com.room.roomsample.data

import com.room.roomsample.domain.Student

interface StudentDatasource {
    suspend fun getAllStudents(): List<Student>
    suspend fun getStudentByAdmissionNo(admission:String): Student
    suspend fun getStudentsCount(): Int
    suspend fun addStudent(student:Student)
    suspend fun deleteStudent(student: Student)
}