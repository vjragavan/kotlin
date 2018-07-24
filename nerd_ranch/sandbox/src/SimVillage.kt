fun main(Args: Array<String>) {

    //passing the function as a parameter
    //don't have to specify the type of the arguments
    runSimulation("Vijay", { name, numBuilding->
        val currentYear = 2018
        println("Adding $numBuilding buildings")
        "Welcome to SimVillage, Mayor $name, Copyright $currentYear"
    })
}

fun runSimulation(name: String, func: (String, Int) -> String) {
    println(func(name, 10))
}