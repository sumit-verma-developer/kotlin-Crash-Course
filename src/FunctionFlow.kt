fun main(){

fun add(a:Int,b:Int):Int{
    return a + b
}
    println(add(1,6))


fun sum(d:Int,e:Int=29):Int{
        return d + e
    }
        println(sum(1))

        // lambda method

     // arrow operator and { } ko lamda opertaion bolte hain.
        val addition:(Int,Int)->Int={x, y ->x+y}
        println(addition(4,5))


        // anonimus function
        val multiply=fun(x:Int,y:Int):Int{
          return x*y
        }
          println(multiply(6,5))



}