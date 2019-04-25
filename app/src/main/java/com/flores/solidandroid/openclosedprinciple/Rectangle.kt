package com.flores.solidandroid.openclosedprinciple

data class Rectangle(
    private val length: Double,
    private val height: Double
) : Operation {
    //the formule fo this volumen is wrong
    override fun getVolumen(): Double {
        return length * length * height
    }

    override fun getArea(): Double {
        return length * height
    }
}