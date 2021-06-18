package com.room.roomsample.data

import com.room.roomsample.domain.Student

class StudentRepository(
    private val studentDatasource: StudentDatasource
) {

    suspend fun addStudent(student: Student) =
        studentDatasource.addStudent(student)

    suspend fun getStudentByAdmission(admission: String) =
        studentDatasource.getStudentByAdmissionNo(admission)

}