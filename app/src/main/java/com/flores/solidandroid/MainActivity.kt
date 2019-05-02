package com.flores.solidandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flores.solidandroid.openclosedprinciple.OpenClosedPrincipleActivity
import com.flores.solidandroid.simpleresponsibilityprinciple.SimpleResponsibilityPrincipleActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOpenClosedPrinciple.setOnClickListener {
            startActivity(Intent(this, OpenClosedPrincipleActivity::class.java))
        }
        btnSimpleResponsiblidityPrinciple.setOnClickListener {
            startActivity(Intent(this, SimpleResponsibilityPrincipleActivity::class.java))
        }
    }
}
