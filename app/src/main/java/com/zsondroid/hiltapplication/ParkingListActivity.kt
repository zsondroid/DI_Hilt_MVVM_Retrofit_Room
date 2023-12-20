package com.zsondroid.hiltapplication

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.zsondroid.hiltapplication.databinding.ActivityParkingListBinding
import com.zsondroid.hiltapplication.viewModel.ParkingListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ParkingListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityParkingListBinding
    private val viewModel: ParkingListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityParkingListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        viewModel.setParkingPlaceData()
    }
}