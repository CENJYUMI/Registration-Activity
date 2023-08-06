package com.example.apexercise5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apexercise5.databinding.ActivityContactDetailsBinding
import com.example.apexercise5.databinding.ActivityMainBinding

class ContactDetails : AppCompatActivity() {
    private lateinit var binding: ActivityContactDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityContactDetailsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val email = intent.getStringExtra("email")
        val address = intent.getStringExtra("address")
        val city = intent.getStringExtra("city")
        val zip = intent.getStringExtra("zip")
        val country = intent.getStringExtra("country")
        val org = intent.getStringExtra("organization")
        val prof = intent.getStringExtra("profession")


        binding.nameView.text = name
        binding.phoneView.text = phone
        binding.emailView.text = email
        binding.addressView.text = address
        binding.cityView.text = city
        binding.zipView.text = zip
        binding.countryView.text = country
        binding.orgView.text = org
        binding.profView.text = prof

    }
}