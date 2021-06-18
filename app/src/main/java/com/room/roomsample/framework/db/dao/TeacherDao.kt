package com.room.roomsample.framework.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.room.roomsample.framework.db.entity.TeacherEntity

@Dao
interface TeacherDao : BaseDao<TeacherEntity> {

    @Query("SELECT * FROM teachers_table")
    suspend fun getAllTeachers(): List<TeacherEntity>
}