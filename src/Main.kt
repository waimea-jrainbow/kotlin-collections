/**
 * Learning about Kotlin collections, particularly
 * the MutableList type
 */

fun main() {
    println("Kotlin Mutablelist")
    println()

    //Create list using val
    val snacks = mutableListOf<String>()

    //Print list
    println(snacks)
    println()

    //add things to list
    snacks.add("Chips")
    snacks.add("Lollies")
    snacks.add("Weapons grade uranium")
    snacks.add("Waluigi")

    //print again
    println(snacks)


    //show specific items using index
    println(snacks[0])
    //println(snacks[4]) this would be out of bound

    //change a value
    snacks[1] = "Dog biscuits"

    println(snacks)

    //remove a item
    snacks.removeAt(0)

    println(snacks)

    //add in new items at specific places
    snacks.add(1,"Doritos")

    println(snacks)

    //sort list
    snacks.sort()

    println(snacks)

    //shuffle the list (randomise order)
    snacks.shuffle()

    println(snacks)

    //get a random item from list
    val item = snacks.random()

    println(item.toString())

    //loop through list
    for (snack in snacks) {
        println(snack.toString())
    }
}

