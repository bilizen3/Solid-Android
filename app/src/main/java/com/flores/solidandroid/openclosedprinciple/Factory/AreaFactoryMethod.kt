package com.flores.solidandroid.openclosedprinciple.Factory

import com.flores.solidandroid.openclosedprinciple.Operation

object AreaFactoryMethod {
    fun getArea(operation: Operation): Double {
        return operation.getArea()
    }
}