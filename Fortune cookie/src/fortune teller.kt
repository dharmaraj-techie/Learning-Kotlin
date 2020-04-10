import java.lang.Math.random

fun main(args : Array<String>) {
//    var fortune: String
//    repeat(10) {
//        fortune = getFortune(getBirthday())
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) return;
//    }
    val random1 = random()
    val random2 = {random()}
    println(random1)
    println(random2)
}

fun getFortune(birthday : Int) : String {
    val fortunes = listOf( "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends, because they are your greatest fortune.")


    val index = when (birthday) {
        in 1..7 -> 4
        28, 31 -> 2
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[index]
}

fun getBirthday(): Int {
    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}