fun main(args: Array<String>) {
    var person = Person("Omer")
    var user = User("User123")
    println(user.age)
}

open class Person(
    var name: String? = null,
    var age: Int? = 0
) { // with this way we do not need constructor or define the variables
    open fun doSomething() {
        println("Person object does something")
    }
}

/* JAVA VERSION ->
class Person{
    String name;
    String age;

    Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    Person(){}
}
 */
class User(name: String) : Person() {
    var username: String? = null

    override fun doSomething() {
        println("User object does something")
    }

    init {
        username = name.capitalize()
        println("Username is $username")
    }
}