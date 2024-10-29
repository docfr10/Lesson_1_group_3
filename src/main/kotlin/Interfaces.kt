package org.example

// Интерфейс Clickable - определяет методы нажатия на кнопку
interface Clickable {
    fun click()
    fun showOff() {
        println("Эта кнопка была нажата")
    }
}

// Интерфейс Focusable - определяет методы фокусировки на кнопке
interface Focusable {
    fun focus()
    fun showOff() {
        println("На этой кнопке было сфокусировано внимание")
    }
}

// Класс Button - реализует интерфейсы Clickable и Focusable
class Button : Clickable, Focusable {
    override fun click() {
        println("Нажатие")
    }

    override fun focus() {
        println("Фокусировка")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}