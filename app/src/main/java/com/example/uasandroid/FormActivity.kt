package com.example.uasandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        button_submit.setOnClickListener {
            tv_nama.text = et_nama.text.toString()
            tv_nim.text = et_nim.text.toString()
            tv_angkatan.text = et_angkatan.text.toString()
            tv_prodi.text = et_prodi.text.toString()
        }
    }
}
