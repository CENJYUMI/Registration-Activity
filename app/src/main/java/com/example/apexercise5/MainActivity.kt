package com.example.apexercise5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Organization
import android.widget.Toast
import com.example.apexercise5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listener for the submit button
        binding.btnSubmit.setOnClickListener {
            // Perform actions on button click
            val name = binding.txtName.text.toString()
            val phone = binding.txtPhone.text.toString()
            val email = binding.txtEmail.text.toString()
            val address = binding.txtaddress.text.toString()
            val city = binding.txtcity.text.toString()
            val zip = binding.txtzip.text.toString()
            val country = binding.txtcountry.text.toString()
            val org = binding.organization.text.toString()
            val prof = binding.professtion.text.toString()

            if (name.isNotEmpty() && phone.isNotEmpty() && email.isNotEmpty() && address.isNotEmpty() &&
                city.isNotEmpty() && zip.isNotEmpty() && country.isNotEmpty() && org.isNotEmpty() && prof.isNotEmpty()) {

                val intent = Intent(this, ContactDetails::class.java)
                intent.putExtra("name", name)
                intent.putExtra("phone", phone)
                intent.putExtra("email", email)
                intent.putExtra("address", address)
                intent.putExtra("city", city)
                intent.putExtra("zip", zip)
                intent.putExtra("country", country)
                intent.putExtra("organization", org)
                intent.putExtra("profession", prof)

                startActivity(intent)
                Toast.makeText(this, "Successfully Registered", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please complete all Required Information", Toast.LENGTH_LONG).show()
            }


        }
    }
}