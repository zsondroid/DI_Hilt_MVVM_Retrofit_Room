package com.zsondroid.hiltapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.zsondroid.hiltapplication.databinding.ActivityMainBinding
import com.zsondroid.hiltapplication.viewModel.RetrofitViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var retrofitViewModel: RetrofitViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initViewModel()

        binding.lifecycleOwner = this
        binding.retrofitViewModel = retrofitViewModel
    }

    private fun initViewModel() {
        retrofitViewModel = ViewModelProvider(this)[RetrofitViewModel::class.java]
        retrofitViewModel.emojiData.observe(this, Observer {
            if (it != null) {
                binding.tvTextEmoji.text = it.name
            }
        })
    }
}