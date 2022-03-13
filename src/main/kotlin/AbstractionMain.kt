fun main(args: Array<String>) {

}

abstract class Person1(name:String){

    init{
        println("Name $name")
    }
    abstract fun doSomething()
}
interface IPerson {
   fun doSomethingMore()
}
class Teacher(name: String): Person1(name),IPerson{
    override fun doSomething() {
        println("Teacher does something")
    }

    override fun doSomethingMore() {
       println("Teacher does something more")
    }

}