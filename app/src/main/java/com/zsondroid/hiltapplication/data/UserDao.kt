package com.zsondroid.hiltapplication.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: User)

    @Update
    suspend fun update(user: User)

    @Delete
    suspend fun delete(user: User)

    @Query("SELECT * FROM User")
    suspend fun selectAll(): List<User>

    @Query("DELETE FROM User WHERE name = :name")
    suspend fun deleteUserByName(name: String)
}