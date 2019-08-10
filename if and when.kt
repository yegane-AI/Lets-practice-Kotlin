var name = "Yegane"
var salutation: String? = "Salam dear!"

fun main(){
    var saluteTo_me = if (salutation != null) salutation else "Hello dear"
    println(saluteTo_me)
    println(name)

    when(salutation){
        null -> println("It is null")
        else -> println(salutation)
    }
}
