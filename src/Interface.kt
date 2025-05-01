
// class 

// interface  - function define kr diya per kya krna kaise krna hain ye define nhi kiya that is abstracted.

interface Shape{
    fun draw()
}


class Triangle:Shape{
 override fun draw(){
    println("Draw a triangle")
 }
}

// fun main(){
//     val triangle=Triangle()
//     triangle.draw()
// }


//  concept of Data Classes 
//Data classes and destructuring declarations
// Component functions generated for data classes make it possible to use them in destructuring declarations: val jane = User("Jane", 35)



data class User(val username:String, val email:String){
    fun displayInfo(){
        println(username + ", " + email)

    }
}

// fun main(){
//     val user=User("sumit","sumit@gmail.com")
//     println(user.displayInfo())
// }



// object 
object DatabaseConfig{
    val url:String="jdbc:mysql://loacalhost:3306"
    fun connect(){
        println("connecting to $url")
    }
}

fun main(){
    DatabaseConfig.connect()
    
}

