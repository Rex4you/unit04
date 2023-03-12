fun main() {
    val min = 1
    val max = 20
    var counter = 0
    val randomValue = (Math.random() * (max - min + 1)).toInt() + min
    while (true) {
        println("Guess what the number is")
        val number = readLine()!!.toInt()

        if (number == randomValue) {
            println("success,  you have guessed:" + counter + " times")
            return
        }

        else if (number > randomValue) {
            println("Too high,try again")

        }

        else if (number < randomValue) {
            println("Too low,try again")
        }
        counter ++
    }

}
main()
