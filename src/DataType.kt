
// const is global variable you can declare on top of main function.
const val PI:Double=3.143

// how many datatype in kotlin

fun main(){
println(PI)

// data type
var a:Int=23
var b:Long=10000L
var c:Float=3.123F
var d:Double=3.143
var e:Char='s'
var f:Boolean=true

println(a)
println(b)
println(c)
println(d)
println(e)
println(f)


// literrals 
var stringLiteral:String="kotlin is fun !"
println("stringLiteral ${stringLiteral}")

//   (arithmetic) operator
var g:Int=23
var h:Int=25
var sum=g+h  // a-b a/b a*b a%b
println("sum ${sum}")


// relational operators
val i=5
val j =20
val isEqual=i==j
val isNotEqual=i!=j
val isGrater=i>j
val isLess=i<j
val isGraterOrEqual=i>=j
val isGraterOrLess=i<=j

println(isEqual)
println(isNotEqual)
println(isGrater)
println(isLess)
println(isGraterOrEqual)
println(isGraterOrLess)


//logical Opertors
val andOperation=true && false // jab dono true hone tabhi true hoga  result false
println(andOperation)

val orOperation=true || false //Ek bhi true hain toh true hoga result true
println(orOperation)

val opposite= !(true)  //Ek bhi true hain toh true hoga result true
println(opposite)
}