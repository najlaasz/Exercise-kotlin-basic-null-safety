fun main() {

    //part1
    var age :Int ?= null // non nullable can not give it null value


    //part2
    var city :String ?= "kuwait"
    city = null

    println(city?.length)


    //part 3
    val cityLength: Int? = city?.length
    println("The length of the city name is $cityLength")


    //part 4

    val CityName: String? = null
    val CityLength = getCityNameLength(CityName)

    println("The length of the city name is $CityLength")

    // part 5
    println(Score(95.0))
    println(Score(null))

}

fun getCityNameLength(city: String?): Int {
    // Provide a default length of 0 if the city name is null
    return city?.length ?: 0
}

fun Score(score: Double?): String {

    val score = score?: "No score available"
    return "The processed score is $score"
}