fun main() {
println("Is it going to rain?")
val probability = 70
    when {
        probability < 40 -> println("Unlikely")
        probability <= 80 -> println("Likely")
        probability < 100 -> println("Yes")
        else -> println("What?")
    }
}


fun main() {
println("Is it going to rain?")
val probability = 70
val text = when {
        probability < 40 -> "Unlikely"
        probability <= 80 -> "Likely"
        probability < 100 -> "Yes"
        else -> "What?"
    }
    println(text)
}

fun main() {
val number = 1 // or 2, 3, 4, 5, 6
    when (number) {
        1 -> {
            println("Missed hit")
        }
        2, 3, 4, 5 -> {
            println("Hit with value $number")
        }
        6 -> {
            println("Critical hit")
        }
    }
}

fun main() {
    var value = "ABC"

    println(value is String) // true
    println(value is Int) // false
    println(value is Boolean) // false
    println(value is Any) // true

    value = 123

    println(value is String) // false
    println(value is Int) // true
    println(value is Boolean) // false
    println(value is Any) // true
}
//typecheck here
//Type-check can also be used as a branch in a when statement with a value. 

fun main() {
val something: Any = "ABC" // or 123, 0.1, true
    when (something) {
        is String -> println("This is String")
        is Int -> println("This is Int")
        is Double -> println("This is Double")
        is Boolean -> println("This is Boolean")
    }
    println(text)
