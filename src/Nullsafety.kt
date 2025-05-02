
// Null Safety (Elvis Operator) unit like void (kuchh nhi return )

fun main(){
//Nullable 
    var name:String?="Johanwick"
    println(name)
    // name=null
    // println(name)

    //safecall 
    var length:Int?=name?.length
    println(length)

    // ternary operator (elvis operator )
    val lengthOrZero:Int=name?.length?:0
    println(lengthOrZero)
    

    // safe casts
    val obj:Any=" i am string"
    val str:String?=obj as? String
    println(str)


    // Exception Handling
    try {
        
    }
    catch(Exception e) {
        
    }finally{
        
    }
}