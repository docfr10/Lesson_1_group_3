package org.example.classes

class Moto {
    // Свойства класса
    var brand: String
    var name: String

    // Вторичный конструктор
    constructor(brand: String, name: String) {
        this.brand = brand + " some String"
        this.name = name
    }
}