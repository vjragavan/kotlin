fun main(Args: Array<String>) {
    //when there is only one argument in the anonymous function
    //you can reference it as 'it' immaterial of the type
    val greetingFunction: (String) -> String = {
        val currentYear = 2018
        "welcome to SimVillage, Mayor ${it}, Copyright ${currentYear}"
    }

    println(greetingFunction("Vijay"))
}