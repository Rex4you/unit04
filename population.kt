fun main() {
    println("Enter the starting number of organisms: ")
    var population = readLine()?.toInt() ?: 0

    if (population < 2) {
        println("Starting population must be greater than or equal to 2.")
        return
    }

    println("Enter the average daily population increase as a percentage: ")
    var increase = readLine()?.toDouble() ?: 0.0

    if (increase < 0) {
        println("Average daily population increase must be non-negative.")
        return
    }

    println("Enter the number of days they will multiply: ")
    var days = readLine()?.toInt() ?: 0

    if (days < 1) {
        println("Number of days they will multiply must be greater than or equal to 1.")
        return
    }

    println("Day 1: $population")
    for (day in 2..days) {
        population = (population * (1 + increase / 100)).toInt()
        println("Day $day: $population")
    }
}
