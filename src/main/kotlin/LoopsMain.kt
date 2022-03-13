fun main(args: Array<String>){
    // For loop
    for (i in 1..5) println(i)
    for (i in 1..5 step 2) println(i)

    for(i in 5 downTo  1) {
        println("Index is $i")
    }

    // Foreach
    (2..10 step 3).forEach({i-> println(i) })
}