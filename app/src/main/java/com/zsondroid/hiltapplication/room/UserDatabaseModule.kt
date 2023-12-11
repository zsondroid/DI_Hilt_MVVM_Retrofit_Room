package com.zsondroid.hiltapplication.room

import android.content.Context
import androidx.room.Room
import com.zsondroid.hiltapplication.data.UserDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class UserDatabaseModule {
    @Provides
    @Singleton
    fun provideUserDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, UserDatabase::class.java, "user_db").build()

    @Provides
    fun provideUserDao(userDatabase: UserDatabase) = userDatabase.userDao()
}