package com.viwave.demosdkaar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.viwave.visdkpacker.SDKPacker

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, SDKPacker.getName(), Toast.LENGTH_SHORT).show()
    }
}
