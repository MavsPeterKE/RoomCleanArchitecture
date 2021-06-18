package com.room.roomsample.framework.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.room.roomsample.framework.db.dao.FeeDao
import com.room.roomsample.framework.db.dao.StudentDao
import com.room.roomsample.framework.db.dao.TeacherDao
import com.room.roomsample.framework.db.entity.FeeEntity
import com.room.roomsample.framework.db.entity.StudentEntity
import com.room.roomsample.framework.db.entity.TeacherEntity

@Database(
    entities = [StudentEntity::class, TeacherEntity::class, FeeEntity::class],
    version = 1,
    exportSchema = true
)
abstract class AppDataBase : RoomDatabase() {

    companion object {
        private var INSTANCE: AppDataBase? = null
        private const val DATABASE_NAME = "roomSample.db"

        fun getDataBaseInstance(context: Context): AppDataBase {
            if (INSTANCE == null) {
                synchronized(AppDataBase::class) {
                    INSTANCE = buildDataBase(context)

                }
            }
            return INSTANCE!!
        }

        private fun buildDataBase(context: Context): AppDataBase? {
            return Room
                .databaseBuilder(context, AppDataBase::class.java, DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .build()
        }
    }

    abstract fun studentDao(): StudentDao
    abstract fun TeacherDao(): TeacherDao
    abstract fun feeDao(): FeeDao

}