fun main(Args: Array<String>) {

    val greetingFunction = { name: String, numBuilding: Int->
        val currentYear = 2018
        println("Adding $numBuilding buildings")
        "Welcome to SimVillage, Mayor $name, Copyright $currentYear"
    }

    runSimulation("Vijay", greetingFunction)

}

fun runSimulation(name: String, func: (String, Int) -> String) {
    println(func(name, 10))
}