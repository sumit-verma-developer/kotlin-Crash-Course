// classes
// class is importnant

class Person(val name:String , var age:Int){
    fun introduce(){
        println("Hi i am $name and my age is $age ")
    }
}

class Rectangle(val width:Double , var height:Double){

  // property
  val area:Double
  get()=width*height

    // method
  fun perimeter():Double{
      return 2*(width+height)
  }
}

// fun main(){
//   // val person= Person("Sumit",20)
//   // person.introduce() 
//   val rectangle=Rectangle(4.0,3.0)
//   println(rectangle.area)
//   println(rectangle.perimeter())
  
// }



// create constructer
class Cylinder(val radius:Double,val height:Double){
  constructor(radius:Double):this(radius,1.0)

  fun volume():Double{
    return Math.PI*radius*radius*height
  }
}


// fun main(){
  
//   val cylinder=Cylinder(5.0)
//   println(cylinder.volume())

  
// }

// important
// inheritance and Interfaces
// open use krte hain ki class ka koi dusra banda extend(access) kr skta hain chahe wo child class hain. 
//wo method function and variable ko access kr skta hain.


open class Animal(val name:String){
  open fun makeSound(){
    println("$name make a sound")
  }
}

// Derived class- extending and getting the Inheritance property.

class Dog(name:String):Animal(name){
  override fun makeSound() {
    println("$name barks")
  }
}



fun main(){

  val dog=Dog("Buddy")
  println(dog.makeSound())
  val cat=Animal("Cat")
  println(cat.makeSound())

  
}



