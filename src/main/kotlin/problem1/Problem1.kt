package problem1

class Problem1 {

    constructor(){
        run()
    }

    private fun run(){
        val dict: IDictionary = DictionaryProvider().createDictionary(DictionaryType.HASH_SET)
        println("Number of words: ${dict.size()}")
        var word: String?
        while (true) {
            print("What to find? ")
            word = readLine()
            if (word.equals("quit")) {
                break
            }
            println("Result: ${word?.let { dict.find(it) }}")
        }
    }
}