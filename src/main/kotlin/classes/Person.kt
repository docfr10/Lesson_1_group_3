package org.example.classes

class Person {
    // Public - ставится по умолчанию, свойство или метод доступно везде
    public var id: Int = 0

    // Private - доступно только внутри класса или того же файла
    private var name: String = ""

    // Protected - доступно только в классе и подклассах
    protected var age: Int = 0

    // Internal - доступно только в рамках одного модуля
    internal var address: String = ""

    init {
        name = "New name"
    }
}