package org.example.classes

// Класс Car
// Первчиный конструктор
class Car(val brand: String, var name: String) {
    // Companion object - создание полей и методов,
    // обращение к которым будет доступно без создания объекта класса
    companion object {
        var wheel: Boolean = true

        fun checkWheel(): Boolean {
            return wheel
        }
    }

    // Блок init - вызывается при инициализации объекта класса
    init {
        println("Инициализирован объект с именем $name")
    }

    // Свойство с поздней инициализацией
    lateinit var engine: String

    // Свойство = поле
    // Приватное свойство
    private var doors: Boolean = true

    // Гетер - получение значения свойства
    fun getDoors(): Boolean = doors

    // Сетер - изменение значения свойства
    fun setDoors(doors: Boolean) {
        this.doors = doors
    }

    // Свойства класса - переменные внутри класса
    var color: String = "White"

    // Методы класса - функции внутри класса
    fun go() {
        println("$name is go!")
    }

    // Второй и последующие блоки init вызовутся поочередно
    init {
        color = "Blue"
    }

    // Переопределение методов
    override fun toString(): String {
        return "Машина бренда $brand, с названием $name, цвета $color"
    }
}