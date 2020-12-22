package com.example.banking

class Customer(idd: Int, fname: String, lname: String, e: String, b: Int) {
   private var id:Int = idd
   private var balance:Int = b
   private val firstname: String = fname
   private val lastname: String = lname
   private val email: String = e

   fun getId(): Int {
      return id
   }

   fun getBalance(): Int{
      return balance
   }

   fun setBalance(amt: Int){
      balance +=  amt
   }

   fun getfirstName(): String {
      return firstname
   }

   fun getlastName(): String {
      return lastname
   }

   fun getEmail(): String{
      return email
   }

   fun getFullName(): String {
      return "$firstname $lastname"
   }
}