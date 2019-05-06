package com.flores.solidandroid.simpleresponsibilityprinciple

import java.lang.Exception

object VerificationNumber {

    fun typeNumber(numb: String): Int {
        return try {
            Integer.parseInt(numb)

        }catch (e:Exception){
            0
        }
    }
}