fun main(Args: Array<String>) {
    val greetingFunction: (String) -> String = { name ->
        val currentYear = 2018
        "welcome to SimVillage, Mayor ${name}, Copyright ${currentYear}"
    }

    println(greetingFunction("Vijay"))
}