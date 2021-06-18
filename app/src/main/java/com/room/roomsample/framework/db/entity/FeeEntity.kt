package com.room.roomsample.framework.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fees_table")
data class FeeEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "transaction_id")
    val transactionId: Int,
    @ColumnInfo(name = "student_adm_no")
    val admissionNo: String,
    @ColumnInfo(name = "amount")
    val paidAmount: Double
)
