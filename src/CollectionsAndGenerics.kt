// (listOf)  Of wale immutable hote hain aap (usko change nhi kr skte hain).

// (mutableListOf) mutable wale list 
// remove dublicate value

fun main(){
    val list1 = listOf("Apple","Banana",2,2.4)
    // println(list1)

   // mutable wale list 
   val list2 = mutableListOf("Dog","Banana",2,2.4)
//    println(list2)
//    list2.add("Bird")
//    println(list2)
//    list2.remove("cat")
//    println(list2)

  // remove dublicate value
  val dublicate = setOf(1,1,1,1,2,3,4,5,6,6,7,7)
  val mutableDublicate = mutableSetOf(1,1,1,1,2,3,8,5,6,6,7,7)
//   println(dublicate)
  mutableDublicate.add(4)
//   println(mutableDublicate)
//   mutableDublicate.remove(1)
//   println(mutableDublicate)

// map for key value pair  mapOf(key to value) (immutable)
val immutableMapList = mapOf(1 to "one",2 to "two")
// println(immutableMapList)
val mutableMapList = mutableMapOf("name" to "sumit", "lastName" to "verma")
// println(mutableMapList)
// update value
mutableMapList["name"]="rohan"
// println(mutableMapList)


// iterate 
val iterateMutableMapList = mutableListOf("red","green","yellow")
for(item in iterateMutableMapList){
    println(item)
}


// map mein esa nhi  kr skte because of key ko bhi comparison krna padega 
val mutableMap=mutableMapOf("name" to "sumit")
for((key,value) in mutableMap){
    println(key + " "  + value)
}


// write generic fun for every data type
fun <T> printElements(elements:List<T>){
    for(element in elements){
        println(element)
    }
}

printElements(listOf(1,2,3,4,7,6,8))
printElements(listOf("sumit","rohan","shyam"))



// create generics class  @anotation hota hain uniqly identify krne ke liye hota hain.
class Box <T>(private var content:T){
    // @JvmName("getContent")
    fun getContent():T{
        return content
    }
}

val intBox=Box(123)
val stringBox=Box("hello")
println(intBox.getContent())
println(stringBox.getContent())

}