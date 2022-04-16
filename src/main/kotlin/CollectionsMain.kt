/*
Array : mutable

Collections
Immutable (Read Only)
    1- Immutable List -> listOf
    2- Immutable Map  -> mapOf
    3- Immutable Set  -> setOf
 Mutable (Read and Write)
    1- Mutable List -> ArrayList, arrayListOf, mutableListOf
    2- Mutable Map  -> HashMap, hashMapOf, mutableMapOf
    3- Mutable Set  -> HashSet, hashSetOf, mutableSetOf
 */
fun main(args: Array<String>) {
    // Collections

    // Arrays
    var array = Array<Int>(5) { 0 }
    var array2 = arrayOf(1, 2, 3)
    for (item in array2) println(item)

    // Lists
    //var theArrayList = mutableListOf<String>() // we can add elements when we initialize it
    //var theArrayList = arrayListOf<String>()  // we can add elements when we initialize it
    //var theArrayList = ArrayList<String>()    // we can NOT add elements when we initialize it
    
    val notNullList = listOfNotNull("This","list","can't","have",null)
    var theArrayList = arrayListOf<String>("omer", "ali") // arraylist with generic
    theArrayList.add("osman")
    theArrayList.remove("osman")
    theArrayList.removeAt(0)

    var list = arrayListOf("omer", "ali", 3) // arraylist without generic

    var theList = listOf<String>("list", "is", "immutable") // can NOT change size or element of lists

    // Map
    var immutableMap = mapOf<Int, String>(1 to "omer", 2 to "omer", 3 to "osman") // Immutable

    for (key in immutableMap.keys) println("Key : $key, Value : ${immutableMap[key]}")

    //var mutableMap = hashMapOf<Int, String>(1 to "omer") // it does not guarantee the order
    //var mutableMap = mutableMapOf<Int,String>(1 to "omer") // it returns LinkedHashMap that is why it always get the data in order
    var mutableMap = HashMap<Int, String>()
    mutableMap.put(12, "omer")
    mutableMap.put(24, "ali")
    mutableMap.put(1, "fatma")
    mutableMap.put(13, "ayse")
    for (key in mutableMap.keys) println("Key : $key, Value : ${mutableMap[key]}")

    mutableMap.replace(12, "teoman")


    // Set

    var set = setOf<Int>(1, 2, 3, 4, 5, 6, 6, 6, 5)
    var set1 = HashSet<Int>()
    var set2 = mutableSetOf<Int>(1, 2, 3, 4, 5, 6, 5, 4) // it returns LinkedHashSet
    var set3 = hashSetOf<Int>(1, 2, 3, 4, 5, 6, 7, 8)
}
