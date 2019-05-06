package com.flores.solidandroid.openclosedprinciple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flores.solidandroid.openclosedprinciple.Factory.AreaFactoryMethod
import com.flores.solidandroid.R
import kotlinx.android.synthetic.main.activity_open_closed_principle.*

class OpenClosedPrincipleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_closed_principle)

        btnAreaCircle.setOnClickListener {
            textViewResult.text =
                AreaFactoryMethod.getArea(Circle(editTextNumber1.text.toString().toDouble())).toString()
        }

        btnAreaRectangle.setOnClickListener {
            textViewResult.text = AreaFactoryMethod.getArea(
                Rectangle(
                    editTextNumber1.text.toString().toDouble(),
                    editTextNumber2.text.toString().toDouble()
                )
            ).toString()
        }

    }
}
