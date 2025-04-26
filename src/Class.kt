// classes


class Person(val name:String , var age:Int){
    fun introduce(){
        println("Hi i am $name and my age is $age ")
    }
}




fun main(){
  val person= Person("Sumit",20)
  person.introduce()

}