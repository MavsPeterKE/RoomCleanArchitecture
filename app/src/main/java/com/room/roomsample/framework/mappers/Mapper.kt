package com.room.roomsample.framework.mappers

import com.room.roomsample.domain.Student
import com.room.roomsample.framework.db.entity.StudentEntity

class Mapper {

    companion object CustomMapper {
        fun MapStudentToStudentEntity(student: Student): StudentEntity {
            return StudentEntity(
                student.admissionNo,
                student.name,
                student.age,
                student.className,
                student.teacherId
            )
        }

        fun MapStudentEntityToStudent(studentEntity: StudentEntity): Student {
            return Student(
                studentEntity.admissionNo,
                studentEntity.name,
                studentEntity.teacherId,
                studentEntity.studentClass,
                studentEntity.teacherId,
                studentEntity.age
            )
        }
    }

}