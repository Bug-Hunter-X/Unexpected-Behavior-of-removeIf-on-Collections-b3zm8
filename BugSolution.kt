fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    for (item in list) {
        if (item % 2 == 0) {
            toRemove.add(item)
        }
    }
    list.removeAll(toRemove)
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val keysToRemove = mutableListOf<String>()
    for ((key, value) in map) {
        if (value % 2 == 0) {
            keysToRemove.add(key)
        }
    }
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {a=1, c=3}

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val toRemoveSet = mutableSetOf<Int>()
    for (item in set) {
        if (item % 2 == 0) {
            toRemoveSet.add(item)
        }
    }
    set.removeAll(toRemoveSet)
    println(set) //Output: [1,3,5]
}