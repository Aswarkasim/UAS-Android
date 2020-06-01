package com.example.uasandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_map.*

class MapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)


          val link = "https://www.google.com/maps/place/Universitas+Negeri+Makassar,+Kampus+Parangtambung/@-5.18534,119.4291754,15z/data=!4m5!3m4!1s0x0:0x17ec8514cbe6bca7!8m2!3d-5.18534!4d119.4291754"

        //val link = "https://facebook.com"

        web_view_map.settings.javaScriptEnabled =true
        web_view_map.settings.loadWithOverviewMode = true
        web_view_map.settings.useWideViewPort=true

        web_view_map.loadUrl(link)
    }
}
