fun main() {
    val min = 1
    val max = 20
    val randomValue = (Math.random() * (max - min + 1)).toInt() + min
    while (true) {
        println("Guess what the number is")
        val number = readLine()!!.toInt() 

        if (number == randomValue) {
            println("success")
            return
        }

        else if (number > randomValue) {
            println("Too high,try again")

        }

        else if (number < randomValue) {
            println("Too low,try again")
        }
    }

}
main()
