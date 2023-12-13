package com.zsondroid.hiltapplication.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zsondroid.hiltapplication.model.RoomRepository
import com.zsondroid.hiltapplication.room.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class RoomViewModel @Inject constructor(private val repository: RoomRepository) : ViewModel() {

    private val _userData = MutableLiveData<List<User>>()
    val userData: LiveData<List<User>> = _userData

    fun getAll() {
        viewModelScope.launch(Dispatchers.IO) {
            val resultUserData = repository.getAll()

            withContext(Dispatchers.Main) {
                _userData.value = resultUserData
            }
        }
    }

    fun insert(user: User) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insert(user)
        }
    }
}