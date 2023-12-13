package com.zsondroid.hiltapplication.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zsondroid.hiltapplication.data.Emoji
import com.zsondroid.hiltapplication.model.RetrofitRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class RetrofitViewModel @Inject constructor(private val repository: RetrofitRepository) : ViewModel() {

    private val _emojiData = MutableLiveData<Emoji>()
    val emojiData: LiveData<Emoji> = _emojiData

    fun setRandomEmojiData() {
        var resultEmojiData: Emoji

        viewModelScope.launch(Dispatchers.IO) {
            resultEmojiData = repository.getRandomEmojiData()

            withContext(Dispatchers.Main) {
                _emojiData.value = resultEmojiData
            }
        }
    }
}

