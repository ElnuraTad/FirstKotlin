package lesson2

fun main(){

    //for

//    for (i in 5..10 ){
//        println(i)
//    }

//    for (i in 5 downTo 0 step 2)
//        println(i)

    //while

    val firstWorkingDay = 10
    var currentDay = 1

    while (currentDay<firstWorkingDay){
        println("Today is the $currentDay day - still holiday")
        currentDay++
    }

    do{
        println("Today is the $currentDay day - still holiday")
        currentDay++
    }while (currentDay<firstWorkingDay)


}