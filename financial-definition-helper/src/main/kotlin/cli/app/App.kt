package cli.app

fun main(args: Array<String>) {
    val arg = args[0]
    println(map.getOrDefault(arg.lowercase(), "No definition found for $arg"))
}

val map = mapOf(
    "a2a" to "Account to Account",
    "ach" to "Automated Clearing House",
    "adc" to "Account Data Compromise",
    "aeba" to "Aadhaar-enabled Bank Account",
    "pop" to "Point of Purchase",
)
