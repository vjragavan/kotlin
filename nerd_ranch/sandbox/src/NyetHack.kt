fun main(args: Array<String>) {
    val name = "Vijay"
    var healthPoints = 89
    var isBlessed = true
    var isImmortal = false
    var isAuraVisible = healthPoints > 50 && isBlessed || isImmortal

    var healthStatus = formatHealthStatus(healthPoints, isBlessed)
    println("$name $healthStatus")
    printPlayerStatus(isAuraVisible, name)
    castFireBall(3)
}

private fun castFireBall(numOfBalls: Int = 2) =
    println("A glass of fireball springs into existence (x$numOfBalls)")

private fun printPlayerStatus(isAuraVisible: Boolean, name: String) {
    var auraStatus = if (isAuraVisible) "Green Aura" else "No Aura"
    println("$name $auraStatus")
}

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