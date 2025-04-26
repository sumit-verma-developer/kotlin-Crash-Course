// control flow (if else, switch case,  )

fun main(){
    val n=15
    if(n>10){
        println("$n is grater than 10")
    }else if(n==10){
        println("$n is equal to 10")
    }else{
        println("$n is less than of 10")
    }


    // switch case 
    val dayOfWeek=4
    val dayName=when(dayOfWeek){
        1->"Monday"
        2->"Tuesday"
        3->"Wednesday"
        4->"Thursday"
        5->"Friday"
        6->"Saturday"
      else -> "Invaid day"
    }
    println("DayName is $dayName ")

    //loops (for loop, while loop)

    //for loop,
    // 1 is initial value,  ..10 incremental value
    for (i in 1..10){
        println("i value is $i ")
    }

    // for jump in for loop use  step
    //step -1 -->  3 skip (4-1)
    for (i in 1..17 step 4){
        println("i value with jump using step is $i ")
    }


   //for loop with downTo,
   // downTo lower value 
   for (i in 8 downTo 0)
   println("i value with DownTo is $i ")


   // while loop
    var counter=0
    while(counter<=10){
    println("counter is :$counter ")
    counter++
      }


      // breake (ab loop aage run nhi hone wala hain)

for (i in 1..10){
    if(i==6){
        println("break")
        break // break or return
    }
    println("before break value  is $i ")
}

// continue
var x=0
for (i in 1..10){
    if(i%2==0){
        // println("Caught")
        continue // by pass krne ke liye 
    }
    // println("not caught $i ")
    x=x+i
}
println(x)

}
