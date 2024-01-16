package com.example.vendingmachineapp

import java.util.Objects

//Display the object that the user chose, userChoice == obj from VendingMCLass
//

val pepsi = VendingMClass("Pepsi", 330, "A lot")
val coke = VendingMClass("Coke", 300, "A lot")
val fanta = VendingMClass("Fanta", 440, "A lot")

val looApp = true

fun main() {
    while (looApp) {
        var userChoice = greet()
        if (userChoiceValidation(userChoice)) {
            displayChoice(userChoice)
        }


        //greet retrieves user choice
        //userChoiceValidation validates the choice
        //


    }
}

fun greet(): String {

    println(
        "What drink would you like? \n" +
                "1. Pepsi: R10 \n" +
                "2. Coke: R12 \n" +
                "3. Fanta R15 \n"
    )

    val userChoice = readln().toString()
    userChoice.lowercase()

    return userChoice
}

fun displayChoice(userChoice: String) {

    when (userChoice) {
        "1" -> itemDetails(pepsi)
        "pepsi" -> itemDetails(pepsi)

        else -> when (userChoice) {
            "2" -> itemDetails(coke)
            "coke" -> itemDetails(coke)

            else -> when (userChoice) {
                "3" -> itemDetails(fanta)
                "fanta" -> itemDetails(fanta)
            }
        }
    }
}

fun itemDetails(item: VendingMClass) {
    println(
        "You have ordered a ${item.name}\n" +
                "its size is ${item.size}ml\n" +
                "and its sugar content is ${item.sugarContent}\n"
    )
}

fun userChoiceValidation(userChoice: String): Boolean {
    if (userChoice == "1" || userChoice == "pepsi" || userChoice == "2" || userChoice == "coke" || userChoice == "3" || userChoice == "fanta") {
        return true
    } else {
        println("$userChoice is not a choice from the list")
        println("Please choose an available option from the list\n")

        return false


    }
    //i added a bunch of code
}


