fun main() {

    println("Введите число для вычисления факториала:")
    val num = readLine()!!.toInt()
    var factorial = 1
    var i = 1
    while (i <= num) {
        factorial *= i
        i++
    }
    println("Факториал числа $num = $factorial")

    println("Введите цену 1 кг конфет:")
    val pricePerKg = readLine()!!.toDouble()

    var kg = 1

    do {
        val totalCost = pricePerKg * kg
        println("Стоимость $kg кг конфет: $totalCost")
        kg++
    } while (kg <= 10)

    println("Введите два целых числа A и B (A < B):")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    println("Целые числа между $a и $b:")
    var count = 0
    for (i in a..b) {
        println(i)
        count++
    }
    println("Количество чисел между $a и $b: $count")

    println("Введите целое число N (> 0):")
    val n = readLine()!!.toInt()

    if (n > 0) {
        var number1 = n
        println("Цифры числа $n (начиная с самой правой):")
        while (number1 > 0) {
            val digit = number1 % 10
            println(digit)
            number1 /= 10
        }
    } else {
        println("Число должно быть больше 0.")
    }

    println("Введите два целых числа A и B (A < B):")
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()

    var currentNumber = A
    var count1 = 0

    do {
        println(currentNumber)
        currentNumber++
        count1++
    } while (currentNumber <= B)

    println("Количество чисел между A и B: $count")

    var number = 1

    do {

        if (number == 19) {
            break
        }

        if (number % 2 != 0) {
            number++
            continue
        }

        if (number % 4 == 0) {
            println(number * 2)
        } else {
            println(number)
        }

        number++
    } while (number <= 20)


    val initialDeposit = 350.0
    val interestRate = 0.07
    val months = 9

    var finalAmount = initialDeposit
    var monthCounter = 0

    do {
        finalAmount += finalAmount * interestRate
        monthCounter++
    } while (monthCounter < months)

    println("Конечная сумма вклада: $finalAmount")
}
