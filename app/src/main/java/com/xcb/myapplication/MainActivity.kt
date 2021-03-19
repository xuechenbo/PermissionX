package com.xcb.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.xcb.permissionx.PermissionX
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListener()
    }

    private fun initListener() {
        btn.setOnClickListener {
            PermissionX.request(this, android.Manifest.permission.CALL_PHONE) { allGranted, deniedList ->
                if (allGranted) {
                    Toast.makeText(this, "获取到了权限", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "没有权限", Toast.LENGTH_LONG).show()
                }

            }
        }
    }
}