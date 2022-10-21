package com.wiley.engageBankingSystem
import scala.io.StdIn.{readInt, readLine}

//The customer class holds information about customers
//It also stored a set of accounts which the customer may have created
class Customer(customer_id: Int, customer_name:String) {
  final val id: Int = customer_id
  var name: String = customer_name
  var age: Int = -1
  var accounts: Set[Account] = Set()

  //The customer can define just their name or their name and age
  def this(id:Int, name:String, customer_age: Int) {
    this(id,name)
    age = customer_age
  }

  //Function to display all information about the customer and their accounts
  def displayInfo(): Unit = {
    println(s"Name: $name")
    println(s"ID: $id")
    if (age != -1) println(s"Age: $age")
    println(s"Accounts: ${accounts.size}")
    for (x <- accounts) {
      println(f" --> ${x.getClass.getSimpleName} - Balance: £${x.balance}%.2f")
    }

    println()
  }

  //Skeleton function that provides user with interface
  def skeleton(): Unit = {
    println("Welcome " + name)
    println("You will be shown a list of options\nEnter the corresponding integer to proceed")
    println("1. Create an account")
    println("2. Display all accounts")
    println("3. Deposit to an account")
    println("4. Transfer to account")
    println("5. Access account")
    println("6. Return to main branch")
    val temp = readLine()
    temp match {
      case "1" => createAccount(); skeleton()
      case "2" => displayAccounts(); skeleton()
      case "3" => depositToAccount(); skeleton()
      case "4" => sendMoney(); skeleton()
      case "5" => accessAccount(); skeleton()
      case "6" => println()
      case _ => println("Invalid input\n"); skeleton()
    }
  }

  //User is able to create an account
  //Any account within the "types" list
  def createAccount(): Unit = {
    val types = List("Basic Account", "Savings Account", "Student Account", "Business Account", "Credit Card")
    println("You currently have " + accounts.size + " accounts")
    println("You will be shown a list of options\nEnter the corresponding integer to proceed")
    for ((t,i) <- types.zipWithIndex) {
      println(i+1 + ". " + t)
    }
    try {
      val temp = readInt()
      temp match {
        case 1 => accounts += new BasicAccount(accounts.size+1)
        case 2 => accounts += new SavingsAccount(accounts.size+1)
        case 3 => accounts += new StudentAccount(accounts.size+1)
        case 4 => accounts += new BusinessAccount(accounts.size+1)
        case 5 => accounts += new CreditCard(accounts.size+1)
        case _ => println("Invalid input\n");
      }

      println(types(temp-1) + " created with ID: " + accounts.size + "\n")
    } catch {
      case e: Exception => println("Invalid input\n"); createAccount()
    }
  }

  //The skeleton interface of a specific account can be accessed here
  def accessAccount(): Unit = {
    println("Enter the ID of the account you wish to access: ")
    displayAccounts()
    try {
      val temp = readInt()
      for (acc <- accounts) if (acc.id == temp) acc.skeleton()
    } catch {
      case e: Exception => println("Invalid input\n"); accessAccount()
    }
  }

  //The user can find information about their currently existing accounts
  def displayAccounts(): Unit = {
    for (acc <- accounts) {
      println(f" --> ${acc.getClass.getSimpleName} - ID: ${acc.id} - Balance: ${acc.balance}%.2f")
    }
    println()
  }

  //Customer can transfer money between their accounts
  def sendMoney(): Unit = {
    println("Enter the account destination and amount, follow the format: ")
    println("From ID, To ID, amount")
    try {
      val temp = readLine()
      val from = temp.split(",").head.toInt
      val to = temp.split(",")(1).split(" ")(1).toInt
      val amount = temp.split(",").last.split(" ")(1).toDouble
      for (acc <- accounts) {
        if (acc.id == from) acc.balance -= amount
        if (acc.id == to) acc.balance += amount
      }
      println("Transfer attempted\n")
    } catch {
      case e: Exception => println("Invalid input\n"); sendMoney()
    }
  }

  //Customer is able to deposit money into a specific account
  def depositToAccount(): Unit = {
    println("Enter the ID of the account, and the amount to deposit, following this format:")
    println("ID, amount")
    try {
      val temp = readLine()
      val temp_id = temp.split(",")(0).toInt
      val temp_amount = temp.split(" ")(1).toDouble
      for (acc <- accounts if acc.id == temp_id) {
        acc.balance += temp_amount
        println(s"Deposited $temp_amount into account with ID: $temp_id \n")
      }
    } catch {
      case e: Exception => println("Invalid input\n"); depositToAccount()
    }
  }

}
