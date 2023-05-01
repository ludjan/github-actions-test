fun main(args: Array<String>) {
    println("Hello World!")

    val str = "ludvig"
    println(StringUtils.capitalize(str))
    println(StringUtils.capitalize(str, 0))
    println(StringUtils.capitalize(str, 2))
    println(StringUtils.capitalize(str, 5))

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}