var name = "Yegane"
var salutation: String? = "Salam jigar!"

fun main(){
    salutation = null
    when(salutation){
        null -> println("It is null")
        else -> println("Hamoun Salam jigar!")
    }
}
