fun main(args: Array<String>) {

    println(4.triple())
    println("Omer".revers())

    var list = arrayListOf<String>("omer", "ali")
    list.swap(0, 1)

    println(5 add 1)
}

// Extension functions
fun Int.triple(): Int = this * 3 // 3.triple()
fun String.revers(): String = this.reversed() // "omer".revers()
fun ArrayList<String>.swap(x: Int, y: Int) {  // list.swap(0,2)
    val temp = this[x]
    this[x] = this[y]
    this[y] = temp;
}

// Infix function
infix fun Int.add(number: Int): Int = this + number // 5 add 1

// Regular functions
fun function() {
    println("Hello world")
}

fun function2(message: String) {
    println("Message is $message")
}

fun function3(): String {
    return "HelloWorld"
}

fun getMessage(): String = function3()