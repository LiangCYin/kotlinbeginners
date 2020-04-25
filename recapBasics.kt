package RecapBasics

fun main(args: Array<String>) {
    var list = listOf("Harry Porter", "The Lord of the Ring", "Java Programming")
    for(i in list){
        if(i.contains('e')){
            for(c in i){
                println(c)
            }
            println()
        }
    }
}