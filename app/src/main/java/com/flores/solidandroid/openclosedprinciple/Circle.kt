package com.flores.solidandroid.openclosedprinciple

class Circle(private val radius: Double) : Shape {
    override fun getArea(): Double {
        return radius
    }
}