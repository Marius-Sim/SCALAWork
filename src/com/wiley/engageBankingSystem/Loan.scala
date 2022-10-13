package com.wiley.engageBankingSystem

class Loan(loan_id: Int, loan_amount: Double) {
  val id: Int = loan_id
  val amount: Double = loan_amount
  var approved: Boolean = false
}
