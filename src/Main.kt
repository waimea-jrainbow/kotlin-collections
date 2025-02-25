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
    println("the item at index 0 is ${snacks[0]}")

    //println(snacks[4]) this would be out of bound

    //change a value
    snacks[1] = "Dog biscuits"

    println("change a value at index 1 $snacks")

    //remove a item
    snacks.removeAt(0)

    println("remove at index 0 $snacks")

    //add in new items at specific places
    snacks.add(1,"Doritos")

    println("added doritos $snacks")

    //sort list
    snacks.sort()

    println("sorted: $snacks")

    //shuffle the list (randomise order)
    snacks.shuffle()

    println("Shuffled:$snacks")

    //get a random item from list
    val item = snacks.random()

    println("random item:  ${item.toString()}")

    //searching for item
    snacks.contains("Chips") //returns boolean

    println("Chips is in list: ${snacks.contains("Chips")}")
    println("Money is in list: ${snacks.contains("Money")}")

    //getting index of item
    println("Chips index: ${snacks.indexOf("Chips")}")
    println("Money index: ${snacks.indexOf("Money")}")

    //loop through list
    for (snack in snacks) {
        println(snack.toString())
    }

    //loop using index
    for (i in 0 until snacks.size) {
        println("$i ${snacks[i].toString()}")
    }
    println()
    //loop using index and values
    for ((i, snack) in snacks.withIndex()) {
        println("$i: ${snack.toString()}")
    }



}

