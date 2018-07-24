fun main(args: Array<String>) {
    val name = "Vijay"
    var healthPoints = 89
    var isBlessed = true
    var isImmortal = false
    var isAuraVisible = healthPoints > 50 && isBlessed || isImmortal

    var healthStatus = if (healthPoints == 100) "is in Good Health"
    else if (healthPoints in 90..99) "has few scratches"
    else if (healthPoints in 75..89)
        if (isBlessed) "has minor injuries, but will heal quickly"
        else "has minor injuries"
    else if (healthPoints in 15..74) "is badly wounded"
    else "is in awful state"

    println("$name $healthStatus")

    var auraStatus = if (isAuraVisible) "Green Aura" else "No Aura"

    println("$name $auraStatus")
}