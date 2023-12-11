package com.zsondroid.hiltapplication.module

import android.content.Context
import androidx.room.Room
import com.zsondroid.hiltapplication.model.RoomRepository
import com.zsondroid.hiltapplication.room.UserDao
import com.zsondroid.hiltapplication.room.UserDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideUserDatabase(@ApplicationContext context: Context): UserDatabase {
        return Room
            .databaseBuilder(
                context,
                UserDatabase::class.java,
                UserDatabase.DB_NAME
            ).build()
    }

    @Singleton
    @Provides
    fun provideUserDao(userDB: UserDatabase): UserDao {
        return userDB.userDao()
    }

    @Singleton
    @Provides
    fun provideUserRepository(userDao: UserDao): RoomRepository {
        return RoomRepository(userDao)
    }
}