package com.zsondroid.hiltapplication

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.zsondroid.hiltapplication.databinding.ActivityMainBinding
import com.zsondroid.hiltapplication.room.User
import com.zsondroid.hiltapplication.viewModel.RetrofitViewModel
import com.zsondroid.hiltapplication.viewModel.RoomViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val retrofitViewModel: RetrofitViewModel by viewModels()
    private val roomViewModel: RoomViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lifecycleOwner = this
        binding.retrofitViewModel = retrofitViewModel
        binding.roomViewModel = roomViewModel

        addTestUserData()
    }

    private fun addTestUserData() {
        val newUser = User("지손", "27", "010-1234-1234")
        roomViewModel.insert(newUser)
    }
}