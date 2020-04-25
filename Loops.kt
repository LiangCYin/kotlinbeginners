package Loops

fun main() {
    var sum = 0L
    for( s in 100..100000L){
//        println(s)
        sum += s
    }
    println(sum)
}