package problem1

object ListDictionary: IDictionary {
    private var wordStorage = mutableListOf<String>("Dog", "Cat")

    override fun add(str: String): Boolean {
        if(str.isNotEmpty()) {
            wordStorage?.add(str)
            return true
        }
        return false
    }

    override fun find(str: String): Boolean {
        return wordStorage.contains(str)
    }

    override fun size(): Int {
        return wordStorage.size
    }
}