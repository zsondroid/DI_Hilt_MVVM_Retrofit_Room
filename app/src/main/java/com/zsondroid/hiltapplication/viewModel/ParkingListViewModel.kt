package com.zsondroid.hiltapplication.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zsondroid.hiltapplication.base.AuthKey
import com.zsondroid.hiltapplication.data.Emoji
import com.zsondroid.hiltapplication.data.ParkingPlaceData
import com.zsondroid.hiltapplication.model.RetrofitRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class ParkingListViewModel @Inject constructor(private val retrofitRepository: RetrofitRepository) : ViewModel() {
    private val _parkingPlaceData = MutableLiveData<ParkingPlaceData>()
    val parkingPlaceData: LiveData<ParkingPlaceData> = _parkingPlaceData

    fun setParkingPlaceData() {
        var resultEmojiData: Emoji

        viewModelScope.launch(Dispatchers.IO) {
            val resultParkingData = retrofitRepository.getParkingPlaceData(AuthKey.KEY, "json", "1", "200", "양주시")

            withContext(Dispatchers.Main) {
                _parkingPlaceData.value = resultParkingData
            }
        }
    }

}