fun main(args: Array<String>) {
    val name = "Vijay"
    var healthPoints = 89
    var isBlessed = false
    var isImmortal = false
    var isAuraVisible = healthPoints > 50 && isBlessed || isImmortal

    
    var healthStatus = formatHealthStatus(healthPoints, isBlessed)
    println("$name $healthStatus")
    printPlayerStatus(isAuraVisible = isAuraVisible, name = name)

    //calling a function with a return type
    var inebiratedLevel = castFireBall(numOfBalls = 53)

    //conditional expression using when
    var inebiratedStatus = when (inebiratedLevel) {
        in 1..10 -> "tipsy"
        in 11..20 -> "sloshed"
        in 21..30 -> "soused"
        in 31..40 -> "stewed"
        in 41..50 -> "..t0aSt3d"
        else -> ""
    }
    println("Inebirated status is $inebiratedStatus")
}

private fun castFireBall(numOfBalls: Int = 2): Int {
    println("A glass of fireball springs into existence (x$numOfBalls)")
    if (numOfBalls > 50)
        return 50
    return numOfBalls
}

private fun printPlayerStatus(isAuraVisible: Boolean, name: String) {
    println("$name ${auraColor(isAuraVisible)}")
}

private fun auraColor(isAuraVisible:Boolean) =
        if (isAuraVisible) "Green Aura" else "No Aura"

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
   when (healthPoints) {
        100 -> "is in Good Health"
        in 90..99 -> "has few scratches"
        in 75..89 -> {
            if (isBlessed) "has minor injuries, but will heal quickly"
            else "has minor injuries"
        }
        in 15..74 -> "is badly wounded"
        else -> "is in awful state"
    }