fun main(args: Array<String>) {
    val name = "Vijay"
    var healthPoints = 89
    var isBlessed = true
    var isImmortal = false
    var isAuraVisible = healthPoints > 50 && isBlessed || isImmortal

    var healthStatus = if (healthPoints == 100)
        "is in Good Health"
    else if (healthPoints >= 90)
        "has few scratches"
    else if (healthPoints >= 75) {
        if (isBlessed)
            "has minor injuries, but will heal quickly"
        else
            "has minor injuries"
    }
    else if (healthPoints >= 15)
        "is badly wounded"
    else
        "is in awful state"

    //player state
    println("$name $healthStatus")

    if (isAuraVisible)
        println("Green Aura")
    else
        println("No Aura")
}