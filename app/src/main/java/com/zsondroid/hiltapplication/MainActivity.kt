package com.zsondroid.hiltapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.zsondroid.hiltapplication.data.User
import com.zsondroid.hiltapplication.data.UserDatabase
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var userDatabase: UserDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        initView()

        val newUser = User("마루", "5", "010-9999-8888")

        lifecycleScope.launch {
            userDatabase.userDao().insert(newUser)
        }
    }

    private fun initView() {
        var userData = emptyList<User>()
        val tvText = findViewById<TextView>(R.id.tv_text)
        val btnReadDB = findViewById<Button>(R.id.bt_btn)
        btnReadDB.setOnClickListener {
            lifecycleScope.launch {
                userData = userDatabase.userDao().selectAll()

                withContext(Dispatchers.Main) {
                    tvText.text = userData.toString()
                }
            }
        }
    }
}