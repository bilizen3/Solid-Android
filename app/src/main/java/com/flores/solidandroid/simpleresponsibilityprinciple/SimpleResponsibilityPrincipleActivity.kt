package com.flores.solidandroid.simpleresponsibilityprinciple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flores.solidandroid.R
import kotlinx.android.synthetic.main.activity_simple_responsibility_principle.*

class SimpleResponsibilityPrincipleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_responsibility_principle)

        btnAdd.setOnClickListener {
            tvResult.text = Operation.add(
                VerificationNumber.typeNumber(etNumb1.toString())
                , VerificationNumber.typeNumber(etNumb2.toString())
            ).toString()
        }

        btnSubtract.setOnClickListener {
            tvResult.text = Operation.subtract(
                VerificationNumber.typeNumber(etNumb1.toString())
                , VerificationNumber.typeNumber(etNumb2.toString())
            ).toString()
        }

        btnMultiply.setOnClickListener {
            tvResult.text = Operation.multiply(
                VerificationNumber.typeNumber(etNumb1.toString())
                , VerificationNumber.typeNumber(etNumb2.toString())
            ).toString()
        }

        btnDivide.setOnClickListener {
            tvResult.text = Operation.divide(
                VerificationNumber.typeNumber(etNumb1.toString())
                , VerificationNumber.typeNumber(etNumb2.toString())
            ).toString()
        }

    }
}
