package org.example.classes

// Абстрактный класс Shape - может быть унаследован только один раз
abstract class Shape {
    // Абстрактный метод - метод, который должен быть переопределен в дочерних классах
    abstract fun area(): Double

    // Обычный метод - метод, который может быть переопределен в дочерних классах
    open fun describe() {
        println("Эта фигура имеет площадь ${area()}")
    }
}

// Дочерний класс Circle
class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

// Дочерний класс Rectangle
class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }

    override fun describe() {
        println("Этот прямоугольник имеет площадь ${area()}")
    }
}