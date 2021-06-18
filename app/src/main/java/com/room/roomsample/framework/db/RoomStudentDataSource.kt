package com.room.roomsample.framework.db

import android.content.Context
import com.room.roomsample.data.StudentDatasource
import com.room.roomsample.domain.Student
import com.room.roomsample.framework.mappers.Mapper.CustomMapper.MapStudentEntityToStudent
import com.room.roomsample.framework.mappers.Mapper.CustomMapper.MapStudentToStudentEntity

class RoomStudentDataSource(context: Context) : StudentDatasource {
    private val studentDao = AppDataBase.getDataBaseInstance(context).studentDao()

    override suspend fun getAllStudents(): List<Student> =
        studentDao.getAllStudents().map { studentEntity ->
            MapStudentEntityToStudent(studentEntity)
        }


    override suspend fun getStudentByAdmissionNo(admission: String): Student {
        val studentEntity = studentDao.getStudentByAdmissionNo(admission)
        return MapStudentEntityToStudent(studentEntity)
    }

    override suspend fun getStudentsCount(): Int = studentDao.getCountOfStudents()

    override suspend fun addStudent(student: Student) =
        studentDao.insert(MapStudentToStudentEntity(student))


    override suspend fun deleteStudent(student: Student) =
        studentDao.delete(MapStudentToStudentEntity(student))


}