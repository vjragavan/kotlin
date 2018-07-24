fun main(Args: Array<String>) {
    //when there is only one argument in the anonymous function
    //you can reference it as 'it' immaterial of the type
    val greetingFunction: (String, String) -> String = {greeting, name ->
        val currentYear = 2018
        "$greeting to SimVillage, Mayor $name, Copyright $currentYear"
    }

    println(greetingFunction("Welcome!", "Vijay"))
}