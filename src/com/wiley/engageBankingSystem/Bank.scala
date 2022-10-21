package com.wiley.engageBankingSystem
import scala.collection.mutable
import scala.io.StdIn.{readInt, readLine}

//Bank class is the main body that runs on an infinite loop
// A bank will allow user to login, create a user, display accounts of individuals or as a whole, and approve loans
//The bank stores customers in a set
class Bank(name:String) {
  var customers: Set[Customer] = Set()

  //Skeleton function that provides user with interface
  def skeleton(): Unit = {
    println("Welcome to " + name)
    println("You will be shown a list of options\nEnter the corresponding integer to proceed")
    println("1. Display a customer's information")
    println("2. Display all customer information")
    println("3. Create a new customer")
    println("4. Login as customer")
    println("5. Approve a loan")
    val choice = readLine()
    choice match {
      case "1" => displayCustomer()
      case "2" => displayAllCustomers()
      case "3" => createCustomer()
      case "4" => customerLogin()
      case "5" => approveLoan()
      case _ => println("Invalid input\n"); println()
    }
    skeleton()
  }

  //The approve loan method loops through all the customers, all the accounts of the customer, and all the loans for each account
  // If approved, the balance of the requested loan is added onto the account
  def approveLoan(): Unit = {
    var temp_loans: List[(Int, String, Account, Loan)] = List()
    var count: Int = 1
    for (customer <- customers) {
      for (acc <- customer.accounts) {
        for (loan <- acc.loans) {
          if (!loan.approved) {
            temp_loans ::= (count, customer.name, acc, loan)
            println(s"ID: $count")
            println(s"Customer: ${customer.name}")
            println(s"Account: ${acc.getClass.getSimpleName}")
            println(f"Amount: £${loan.amount}%.2f\n")
            count += 1
          }
        }
      }
    }
    println("Enter ID of loan to approve or 0 to exit")
    try {
      val temp = readInt()
      if (temp != 0) {
        for (loan <- temp_loans) {
          if (loan._1 == temp) {
            loan._4.approved = true
            loan._3.balance += loan._4.amount
          }
        }
      }
      println("You have approved a loan\n")
    } catch {
      case e: Exception => println("Invalid input\n"); approveLoan()
    }
  }

  //Displays a specific customer based on their name
  //Can potentially display more than one if customers share name
  def displayCustomer(): Unit = {
    println("Enter the name of the customer")
    val temp = readLine()
    for (customer <- customers) {
      if (customer.name.toLowerCase.contains(temp.toLowerCase())) {
        customer.displayInfo()
      }
    }
  }

  //Displays information about every customer of the bank
  def displayAllCustomers(): Unit = {
    for (customer <- customers) customer.displayInfo()
  }

  //Customer creation method, it allows the user to enter their name, name + last name, or name + last name + age
  def createCustomer(): Unit = {
    println("Enter the name of the customer")
    println("Or to enter both the name and the age, follow this format")
    println("First Last, Age")
    val temp = readLine()
    try {
      if (temp.contains(",")) {
        customers += new Customer(customers.size+1, temp.split(",")(0), temp.split(",")(1).split(" ")(1).toInt)
      } else {
        customers += new Customer(customers.size+1, temp)
      }
      println("Customer created with ID: " + customers.size + "\n")
    } catch {
      case e: Exception => println("Invalid input\n"); createCustomer()
    }
  }

  //The customer is able to login
  //Once logged in, they will be able to access the skeleton of the Customer interface
  def customerLogin(): Unit = {
    println("Enter your customer ID")
    println("To find this out, return to the main branch and select option 1 or 2")

    try {
      val temp = readInt()
      for (customer <- customers if customer.id == temp) {
        customer.skeleton()
      }
    } catch {
      case e: Exception => println("Invalid input\n"); customerLogin()
    }
  }
}

//The object that needs to be run on start up
//Test customers, accounts, and loans were created to showcase the functionality of the program
object bankSystem extends App {
  var bank = new Bank("Bank of America")
  //Hard coded accounts, balances, loans, for testing purposes
  bank.customers += new Customer(bank.customers.size+1, "Marius Simion", 22)
  bank.customers += new Customer(bank.customers.size+1, "Jinesh Ranawat")
//  bank.customers += new Customer(bank.customers.size+1, "Wiley Edge", 25)
  var temp = bank.customers.head
  temp.accounts += new BusinessAccount(temp.accounts.size)
  temp.accounts.head.balance = 500
  var tempacc = new StudentAccount(temp.accounts.size)
  var tempacc2 = new StudentAccount(temp.accounts.size)
  tempacc.balance = 200
  temp.accounts += tempacc
  temp.accounts.head.loans += new Loan(1, 500)
  temp.accounts += tempacc2
  temp.accounts.last.loans += new Loan(2, 800)
  //End of testing code, everything in between the commented lines can be removed without impacting program
  bank.skeleton()
}
