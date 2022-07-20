package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var student: Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //if java -> Student student = new Student()


        binding.btnSetValue.setOnClickListener(){
            student = Student("Ali", 20, "RSD")
            binding.myData = student
        }

        //todo:: display student info
        //example: if use plaintext in design, we can use binding.editTextTextPersonName2.setText(student.name)
        binding.btnDisplay.setOnClickListener() {
            student.programme = "RIS"
            student.age = 21

            binding.apply {
                invalidateAll() //auto refresh the data
            }
        }

    }
}