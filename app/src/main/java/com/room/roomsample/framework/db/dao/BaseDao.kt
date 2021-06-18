package com.room.roomsample.framework.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface BaseDao<T> {
    @Insert
    suspend fun insert(t: T)

    @Insert
    suspend fun insertList(tList: List<T>)

    @Update
    suspend fun update(t: T)

    @Delete
    suspend fun delete(t: T)
}