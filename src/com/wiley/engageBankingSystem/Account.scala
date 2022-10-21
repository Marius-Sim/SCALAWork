package com.wiley.engageBankingSystem
import scala.io.StdIn.{readDouble, readLine}

//Account class is abstract as each specific account inherits its functionality
//Each account, no matter the type, has to store this information
//Such as balance, possible loans, card details
abstract class Account {
  val id: Int
  var balance: Double = 0
  var loans: Set[Loan] = Set()
  var card_number: Long = 0
  var card_month: Int = 0
  var card_year: Int = 0
  var card_cvv: Int = 0

  //The account holder can request a loan of any amount
  //The request will appear in the Bank skeleton interface for a bank operative to approve
  def requestLoan(): Unit = {
    println("Enter the amount to request: ")
    try {
      val temp = readDouble()
      loans += new Loan(loans.size+1, temp)
      println("Loan requested, await approval from the bank\n")
    } catch {
      case e: Exception => println("Invalid input\n"); requestLoan()
    }
  }

  //Randomly generates a 16 digit long card number
  def generateCard(): Long = {
    val rand = new scala.util.Random
    rand.between(1000000000000000L, 10000000000000000L)
  }

  //Randomly generates a month
  def generateMonth(): Int = {
    val rand = new scala.util.Random
    rand.between(1,12)
  }

  //Randomly generates the 3 digit security code on the back of the card
  def generateCVV(): Int = {
    val rand = new scala.util.Random
    rand.between(100, 999)
  }

  //Function to display the card details
  def displayCardDetails(): Unit = {
    println(getClass.getSimpleName)
    println(card_number)
    println(s"$card_month/$card_year")
    println(card_cvv)
    println()
  }

  //The user interface when handling their accounts
  def skeleton(): Unit = {
    println(s"Welcome to your ${getClass.getSimpleName}")
    println("1. Generate card details")
    println("2. Display card details")
    println("3. Request loan")
    println("4. Return to customer branch")
    val temp = readLine()
    temp match {
      case "1" => if (card_number == 0) {
        card_number = generateCard()
        card_month = generateMonth()
        card_year = 2027
        card_cvv = generateCVV()
        println("You have generated card details\n")
        skeleton()
      } else println("You already have card details")
      case "2" => if (card_number != 0) displayCardDetails() else println("First generate your card details\n"); skeleton()
      case "3" => requestLoan(); skeleton()
      case "4" => println("\n")
      case _ => println("Invalid input\n")
    }
  }

}
