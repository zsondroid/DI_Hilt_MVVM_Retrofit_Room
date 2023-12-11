package com.zsondroid.hiltapplication.model

import com.zsondroid.hiltapplication.room.User
import com.zsondroid.hiltapplication.room.UserDao
import javax.inject.Inject

class RoomRepository @Inject constructor (private val userDao: UserDao) {

    fun getAll() = userDao.selectAll()

    fun insert(user: User) {
        userDao.insert(user)
    }
}