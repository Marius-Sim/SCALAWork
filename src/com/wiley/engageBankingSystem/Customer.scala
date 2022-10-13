package com.wiley.engageBankingSystem
import scala.io.StdIn.{readInt, readLine}

class Customer(customer_id: Int, customer_name:String) {
  final val id: Int = customer_id
  var name: String = customer_name
  var age: Int = -1
  var accounts: Set[Account] = Set()

  def this(id:Int, name:String, customer_age: Int) {
    this(id,name)
    age = customer_age
  }

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

  def skeleton(): Unit = {
    println("Welcome " + name)
    println("You will be shown a list of options\nEnter the corresponding integer to proceed")
    println("1. Create an account")
    println("2. Display all accounts")
    println("3. Deposit to an account")
    println("4. Transfer to account")
    println("5. Access account")
    println("6. Return to main branch")
    val temp = readInt()
    temp match {
      case 1 => createAccount(); skeleton()
      case 2 => displayAccounts(); skeleton()
      case 3 => depositToAccount(); skeleton()
      case 4 => sendMoney(); skeleton()
      case 5 => accessAccount(); skeleton()
      case 6 => ""
      case _ => println("Invalid input"); skeleton()
    }
  }

  def createAccount(): Unit = {
    val types = List("Basic Account", "Savings Account", "Student Account", "Business Account", "Credit Card")
    println("You currently have " + accounts.size + " accounts")
    println("You will be shown a list of options\nEnter the corresponding integer to proceed")
    for ((t,i) <- types.zipWithIndex) {
      println(i+1 + ". " + t)
    }
    val temp = readInt()
    temp match {
      case 1 => accounts += new BasicAccount(accounts.size+1)
      case 2 => accounts += new SavingsAccount(accounts.size+1)
      case 3 => accounts += new StudentAccount(accounts.size+1)
      case 4 => accounts += new BusinessAccount(accounts.size+1)
      case 5 => accounts += new CreditCard(accounts.size+1)
      case _ => println("Invalid input"); createAccount()
    }
    println(types(temp-1) + " created with ID: " + accounts.size + "\n")
  }

  def accessAccount(): Unit = {
    println("Enter the ID of the account you wish to access: ")
    displayAccounts()
    val temp = readInt()
    for (acc <- accounts) if (acc.id == temp) acc.skeleton()
  }

  def displayAccounts(): Unit = {
    for (acc <- accounts) {
      println(f" --> ${acc.getClass.getSimpleName} - ID: ${acc.id} - Balance: ${acc.balance}%.2f")
    }
    println()
  }

  def sendMoney(): Unit = {
    println("Enter the account destination and amount, follow the format: ")
    println("From ID, To ID, amount")
    val temp = readLine()
    val from = temp.split(",").head.toInt
    val to = temp.split(",")(1).split(" ")(1).toInt
    val amount = temp.split(",").last.split(" ")(1).toDouble
    for (acc <- accounts) {
      if (acc.id == from) acc.balance -= amount
      if (acc.id == to) acc.balance += amount
    }
    println("Transfer attempted\n")
  }

  def depositToAccount(): Unit = {
    println("Enter the ID of the account, and the amount to deposit, following this format:")
    println("ID, amount")
    val temp = readLine()
    val temp_id = temp.split(",")(0).toInt
    val temp_amount = temp.split(" ")(1).toDouble
    for (acc <- accounts if acc.id == temp_id) {
      acc.balance += temp_amount
      println(s"Deposited $temp_amount into account with ID: $temp_id \n")
    }
  }

}
