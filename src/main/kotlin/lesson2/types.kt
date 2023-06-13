package lesson2

/*

Byte - 8-bit integer, Range from - 128 t0 127
Short - 16 bit integer, Range from - 32768 t0 32767
Int - 32 bit integer, Range from -2^31 t0 2^31-1
Long - 64 bit integer
Float - 32 bit floating point number
Double - 64 Bit floating point number
Boolean - 1 bit values true or false
Char - 16 bit Unicode Single character 'Z'
String - a string "text"

Literals by default : Double and Int
 */


fun main(){
    val a = 10.2
    val byteNumber : Byte = 12
    val myLongNum = 12_233_541L
    val myIntNum = myLongNum.toInt()
    val myChar = 'c'

    //Interpolations
    val myString = "$byteNumber here can add some text $myIntNum"



}
