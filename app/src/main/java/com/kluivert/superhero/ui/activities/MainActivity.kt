package com.kluivert.superhero.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.kluivert.superhero.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setupActionBarWithNavController(findNavController(R.id.herofragment))

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.herofragment)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}