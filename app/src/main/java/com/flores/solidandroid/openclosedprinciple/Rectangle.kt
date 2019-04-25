package com.flores.solidandroid.openclosedprinciple

data class Rectangle(private val length: Double,
                     private val height: Double) : Shape {
    override fun getArea(): Double {
        return length * height
    }
}