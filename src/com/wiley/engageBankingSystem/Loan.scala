package com.wiley.engageBankingSystem

//A loan can only be approved from the Bank skeleton interface
//Once a loan is approved, the value that was requested gets added to the account that created the request
class Loan(loan_id: Int, loan_amount: Double) {
  val id: Int = loan_id
  val amount: Double = loan_amount
  var approved: Boolean = false
}
