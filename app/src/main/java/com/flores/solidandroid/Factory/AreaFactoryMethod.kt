package com.flores.solidandroid.Factory

import com.flores.solidandroid.openclosedprinciple.Operation

object AreaFactoryMethod {
    fun getArea(operation: Operation): Double {
        return operation.getArea()
    }
}