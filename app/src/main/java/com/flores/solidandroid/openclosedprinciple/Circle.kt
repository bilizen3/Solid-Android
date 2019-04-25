package com.flores.solidandroid.openclosedprinciple

class Circle(private val radius: Double) : Operation {
    override fun getVolumen(): Double {
        return 0.0
    }

    override fun getArea(): Double {
        return radius * radius * Math.PI
    }
}