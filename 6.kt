fun main() {
    println("Введите две различных цифры, каждую с новой строки:")
    val digit1 = readLine()?.toIntOrNull()
    val digit2 = readLine()?.toIntOrNull()

    if (digit1 == null || digit2 == null || digit1 !in 0..9 || digit2 !in 0..9 || digit1 == digit2) {
        println("Ошибка: Введите две различные цифры от 0 до 9.")
        return
    }

    val possibilities = listOf(digit1 * 10 + digit2, digit2 * 10 + digit1)
    val oddNumber = possibilities.firstOrNull { it % 2 != 0 }

    if (oddNumber != null) {
        println("Результат: Можно создать нечетное число $oddNumber")
    } else {
        println("Создать нечетное число невозможно")
    }
}
