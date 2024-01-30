fun main() {
    var userSelection: Int

    do {
        // Display menu
        println("Please enter the number of your selection:")
        println("1. King meal deal, (2 sandwiches, 1 small fries, and 1 small drink)")
        println("2. Burger King Bogo,( Buy One, Get One Free Whopper Meal)")
        println("3. Burger King snack box,(A box full of flavor. 6 onion rings," +
                " 12 chicken nuggets," +
                " 6 chili cheese nuggets, and 2 sauces)")
        println("4. Coffee")
        println("5. Exit")

        // Read user input
        val userInput = readLine()
        userSelection = userInput?.toIntOrNull() ?: 0

        // Process user selection
        when (userSelection) {
            1 -> println("You have selected:\n1. King meal deal\n")
            2 -> println("You have selected:\n2.Burger King Bogo\n")
            3 -> println("You have selected:\n3. Burger King snack box\n")
            4 -> println("You have selected:\n4. Coffee\n")
            5 -> println(" Goodbye!\n")
            else -> println("Invalid entry, try again\n")
        }
    } while (userSelection != 5)
}
