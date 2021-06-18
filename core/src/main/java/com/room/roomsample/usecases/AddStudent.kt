package com.room.roomsample.usecases

import com.room.roomsample.data.StudentRepository
import com.room.roomsample.domain.Student

class AddStudent(private val studentRepository: StudentRepository) {
    suspend operator fun invoke(student: Student) {
        studentRepository.addStudent(student)
    }
}