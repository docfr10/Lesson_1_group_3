package org.example

import kotlin.math.pow

fun main() {
    // ЗАНЯТИЕ 1
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
    val (q, w, t) = readln().split(" ").map { it.toInt() }
    println("$q, $w, $t")

    // ЗАНЯТИЕ 2
    // Условные операторы
    // If-else
    if (b1 > a2)
        println(b1)
    else if (b1 == a2) {
        println("b1==a2")
    } else {
        println(a2)
    }
    // When
    val day = 32
    val dayName = when (day) {
        1 -> "Пн"
        2 -> "Вт"
        3 -> "Ср"
        4 -> "Чт"
        5 -> "Пт"
        6, 7 -> "Выходной день!"
        in 8..31 -> "Выход за пределы календаря"
        else -> "Некорректный день!"
    }
    println(dayName)
    val max = when (b1 > a2) {
        true -> b1
        false -> a2
    }
    println(max)
    // Циклы
    // For
    println("FOR")
    for (i in 1..5) {
        if (i == 4) continue
        if (i == 5) break
        println(i)
    }
    // Разворот диапозона с шагом 25
    for (i in 100 downTo 1 step 25) {
        println(i)
    }
    // Игнорирование последней границы
    for (i in 1 until 10) {
        println(i)
    }
    // While
    println("WHILE")
    var num = 5
    while (num > 0) {
        println(num)
        num--
    }
    // Do-While
    println("Do-While")
    var num2 = 0
    do {
        println(num2)
        num2++
    } while (num2 < 5)
    // Коллекции
    // Массивы
    println("ARRAY")
    val array = arrayOf<Int>(1, 2, 3, 4, 5, 1)
    val emptyArray = emptyArray<String>()
    val specialArray1 = booleanArrayOf(true, false)
    val specialArray2 = intArrayOf(1, 2, 6)
    val specialArray3 = doubleArrayOf(5.9, 4.2)
    array[3] = 10
    println(array[3])
    println(array.first())
    println(array.last())
    println("Array size =  ${array.size}")
    println(array.indexOf(1))
    println(array.contains(10))
    // Многомерный массив
    val arrayM = Array(5, { arrayOf(1, 2, 3, 4, 5) })
    for (j in arrayM) {
        for (i in j) {
            println(i)
        }
    }
    // Списки
    // Неизменяемый
    val list = listOf("afsad", " asfasfsa", "f")
    // Изменяемый список
    println("MUTABLE LIST")
    val mutableList = mutableListOf("asf", "asf", "tasfaf", "sgeds")
    mutableList.add("ihsaohd")
    mutableList.add(0, "11212q")
    mutableList.addAll(listOf("3123", "4124", "55"))

    mutableList.forEach {
        println(it)
    }

    // Подсписок
    mutableList.subList(0, 3)

    mutableList[2] = "dfafasfaf"

    mutableList.remove("asf")
    mutableList.removeAt(4)
    mutableList.clear()

    // Множество
    println("MUTABLE SET")
    val set = setOf("efasf", "fasf", "afs")
    val mutableSet1 = mutableSetOf(1, 2, 3, 3, 3, 3, 3)
    mutableSet1.forEach { println(it) }
    val mutableSet2 = mutableSetOf(3, 4, 5)
    println(mutableSet1.union(mutableSet2))
    println(mutableSet1.intersect(mutableSet2))
    println(mutableSet1.subtract(mutableSet2))

    // Ассоциативный массив
    val mutableMap = mutableMapOf("str" to 1, 3 to "Hi!", false to 12, false to 4)
    mutableMap.forEach {
        println("Key ${it.key} = value ${it.value}")
    }
    mutableMap[3] = 56

    // Null безопастность
    println("NULL")
    val l = null
    var str: String? = "Hello"
    str = "Hi!"
    println(str)
    str = null
    println(str)
    println(str?.length)

    val listNull = listOf("asfa", "asfsaf", null, "fsaf")
    listNull.forEach {
        println(it?.length)
    }

    // Try-catch
    println("TRY-CATCH")
    try {
        listNull.forEach {
            println(it!!.length)
        }
    } catch (e: Exception) {
        println("Exception")
    }
}