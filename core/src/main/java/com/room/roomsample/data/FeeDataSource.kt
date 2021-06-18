package com.room.roomsample.data

import com.room.roomsample.domain.Fee

interface FeeDataSource {
    suspend fun getFeeByAdmissionId()
    suspend fun getTotalFeesPaid()
    suspend fun addFee(fee: Fee)
}