package lesson2

fun main(){

    val temp = 10
    val coldIndicator = 0
    val midTempIndicator = 10

    //block if

    if(temp > coldIndicator){
        println("hot")
    }

    //block if else
    //variant1
    if (temp > coldIndicator)
        println("hot")
    else println("cold")

    //variant2
    if (temp > coldIndicator) {
        println("hot")
    }else {
        println("cold")
    }

    //block if else if else if... else
    if (temp > midTempIndicator){
        println("hot")
    }else if(temp > coldIndicator) {
        println("normal")
    } else{
        println("cold")
    }

    //if else expression

    val result = if(temp > coldIndicator){
        "hot"
    } else if (temp > midTempIndicator){
        "normal"
    } else{
        "cold"
    }
    println(result)

    //Branches o aan if expression

    val a = 3
    val b = 32

    val max = if (a>b){
        print("choose a")
        a
    }else{
        print("choose b")
        b
    }

    //when operator
    val integer = when('X'){
        'I'-> 1
        'V'-> 5
        'X'-> 10
        'L'-> 50
        'C'-> 100
        'D'-> 500
        'M'-> 1000
        else -> 0
    }

    when(a) {
        0, 1 , 2 -> print("a==0 or a==1")
        else -> print("otherwise")
    }

    when(a){
        in 0..10 -> print("a is in the range")
        else -> print(" a is outside the range")
    }

    when{
        a>b -> println("a bigger then b")
        a==b -> println("a equals b")
        a<b -> println("a less then b")
    }



}

