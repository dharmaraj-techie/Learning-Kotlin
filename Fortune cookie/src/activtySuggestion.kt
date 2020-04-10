fun whatShouldIDoToday(mood: String,
                       weather: String = "Sunny",
                       temperature: Int = 24): String {
    fun happy()= mood == "happy" && weather == "Sunny"
    fun sad () = mood == "sad" && weather == "rainy" && temperature == 0
    return when{
        happy() -> "go for a walk"
        sad() -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read."
    }

}

