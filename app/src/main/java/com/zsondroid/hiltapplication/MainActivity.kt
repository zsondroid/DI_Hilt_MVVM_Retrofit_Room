package com.zsondroid.hiltapplication

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.zsondroid.hiltapplication.databinding.ActivityMainBinding
import com.zsondroid.hiltapplication.room.User
import com.zsondroid.hiltapplication.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lifecycleOwner = this
        binding.mainViewModel = mainViewModel

        addTestUserData()
    }

    private fun addTestUserData() {
        val newUser = User("지손", "27", "010-1234-1234")
        mainViewModel.insert(newUser)
    }
}