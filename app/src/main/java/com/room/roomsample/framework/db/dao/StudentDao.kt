package com.room.roomsample.framework.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.room.roomsample.framework.db.entity.StudentEntity

@Dao
interface StudentDao : BaseDao<StudentEntity> {

    @Query("SELECT * FROM students_table")
    suspend fun getAllStudents(): List<StudentEntity>

    @Query("SELECT Count(*) FROM students_table")
    suspend fun getCountOfStudents(): Int

    @Query("SELECT * FROM students_table WHERE admission_no=:admission")
    suspend fun getStudentByAdmissionNo(admission: String):StudentEntity
}