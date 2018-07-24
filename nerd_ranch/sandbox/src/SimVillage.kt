fun main(Args: Array<String>) {
    val greetingFunction: () -> String = {
        val currentYear = 2018
        "welcome to SimVillage, Mayor! Copyright ${currentYear}"
    }

    println(greetingFunction())
}