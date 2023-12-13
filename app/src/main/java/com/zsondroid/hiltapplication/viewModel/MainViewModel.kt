package com.zsondroid.hiltapplication.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zsondroid.hiltapplication.data.Emoji
import com.zsondroid.hiltapplication.model.RetrofitRepository
import com.zsondroid.hiltapplication.model.RoomRepository
import com.zsondroid.hiltapplication.room.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val retrofitRepository: RetrofitRepository, private val roomRepository: RoomRepository) : ViewModel() {
    private val _emojiData = MutableLiveData<Emoji>()
    val emojiData: LiveData<Emoji> = _emojiData

    private val _userData = MutableLiveData<List<User>>()
    val userData: LiveData<List<User>> = _userData

    fun setRandomEmojiData() {
        var resultEmojiData: Emoji

        viewModelScope.launch(Dispatchers.IO) {
            resultEmojiData = retrofitRepository.getRandomEmojiData()

            withContext(Dispatchers.Main) {
                _emojiData.value = resultEmojiData
            }
        }
    }

    fun getAll() {
        viewModelScope.launch(Dispatchers.IO) {
            val resultUserData = roomRepository.getAll()

            withContext(Dispatchers.Main) {
                _userData.value = resultUserData
            }
        }
    }

    fun insert(user: User) {
        viewModelScope.launch(Dispatchers.IO) {
            roomRepository.insert(user)
        }
    }
}