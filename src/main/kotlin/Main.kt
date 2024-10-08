package org.example

import kotlin.math.pow

fun main() {
    // Вывод в консоль
    print("New text!\nAgain new text!\nHi!")
    println("Hello World!")
    println("Something!")
    // Изменяемые явные переменные
    println("Изменяемые явные переменные")
    var a: Int = 10
    var b: Int = 20
    var c: Int = 30
    var d: Double = 3.5
    var e: Char = 'e'
    var f: String = "String"
    var g: Boolean = false
    println(a)
    println(b)
    println(c)
    a = 30
    b = 10
    c = 20
    println(a)
    println(b)
    println(c)
    // Неизменяемые явные переменные
    val a1: Int = 10
    val b1: Int = 20
    val c1: Int = 30
    // Неявная типизация
    val a2 = 10
    val b2 = 3.5F
    /*
      ТИПЫ ДАННЫХ В KOTLIN
       Числовые типы данных:
        Целочисленные:
            1) Byte
            2) Short
            3) Int
            4) Long
        С плавающей точкой
            1) Float
            2) Double
       Символьные типы данных: Char
       Строковые тип данных: String
       Логический тип данных: Boolean
     */
    // Строковая интерполяция
    println("Строковая интерполяция")
    println("a1 = " + (a1 + 10))
    println("b1 = ${b1 + c1}")
    println("a2 = $a2, b2 = $b2")
    // Арифметические операции
    println("Арифметические операции")
    println(a + a2)
    println(a - a2)
    println(a * a2)
    println(a / a2)
    println(a2 % a)
    println(b2.pow(2))
    println(c1.toDouble().pow(2))
    // Операторы сравнения
    println("Операторы сравнения")
    println(a1 == a2)
    println(b != a2)
    println(b1 > a2)
    println(b1 < a2)
    println(b1 >= a2)
    println(b1 <= a2)
    // Ввод через консоль
    println("Ввод через консоль")
    val input = readln().toInt()
    println(input)
    val (q, w, t) = readln().split(" ")
    println("$q, $w, $t")
}