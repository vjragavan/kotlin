fun main(args: Array<String>) {
    val name = "Vijay"
    var healthPoints = 89
    var isBlessed = true
    var isImmortal = false
    var isAuraVisible = healthPoints > 50 && isBlessed || isImmortal

    if (healthPoints == 100)
        println("${name} is in Good Health")
    else if (healthPoints >= 90)
        println("${name} has few scratches")
    else if (healthPoints >= 75) {
        if (isBlessed)
            println("$name has minor injuries, but will heal quickly")
        else
            println("$name has minor injuries")
    }
    else if (healthPoints >= 15)
        println("${name} is badly wounded")
    else
        println("${name} is in awful state")

    if (isAuraVisible)
        println("Green Aura")
    else
        println("No Aura")
}