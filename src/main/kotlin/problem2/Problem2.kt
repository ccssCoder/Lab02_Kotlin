package problem2

fun String.printsMonogram() {
    println(
        this.split(" ")
            .map { it.subSequence(0,1) }
            .joinToString (separator = "") { it }
    )
}

fun List<String>.joinedByGivenSeparator(delim: String) : String
    = this.joinToString (separator = delim) { it }

fun List<String>.longest() : String = this.maxOrNull()!!

class Problem2 {

    constructor(){
        run()
    }

    private fun run(){
//        Define an extension function that prints the monogram of a String containing the
//        firstname and lastname. Example: John Smith → JS
//        Loops are forbidden! Try to use split, map and joinToString!
        val myString= "John Smith"
        myString.printsMonogram()

//        Define a compact extension function that returns the elements of
//        a strings’ list joined by a given separator!
//        Example: (list: [“apple”, “pear”, “melon”]; separator: # ) → ”apple#pear#melon”
        val list = listOf<String>("apple", "pear", "melon")
        println(list.joinedByGivenSeparator("#"))

//        Define a compact extension function for a strings’ list that returns the longest string!
//        Example: Longest [apple, pear, strawberry, melon] = strawberry
        val list2 = listOf<String>("apple", "pear", "strawberry", "melon")
        println(list2.longest())
    }
}