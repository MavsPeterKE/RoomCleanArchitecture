package com.room.roomsample.framework.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.room.roomsample.framework.db.entity.FeeEntity

@Dao
interface FeeDao : BaseDao<FeeEntity> {

    @Query("SELECT * FROM fees_table")
    suspend fun getAllPaidFee(): List<FeeEntity>
}