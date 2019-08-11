/* Here we will see how to change the type of a variable. */
var esm = "Yegane" /*In this section, the type "string" is assigned to esm.
                    It can not be changed into something other than string. */

fun main(args:Array<String>){
    esm = 10.toString() /* If I wanna type a string like "10", kotlin can not
                           understand what I mean. So it takes my 10 as an integer.
                             I should make some changes to tell kotlin that my 10 is a string.
                             So I will use the function ".toString" to do my changes. */
    println(esm)
}
