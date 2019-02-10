package com.scalatut.functionalprogram

object HigherOrderFuntion_4 extends App{
  
  //takes one or more functions as args
  //returns a function as its result
  
  def f1= println("hello")
  //returns a funtion
  def retDoubFuntion(f1:Int)=(i:Int)=>{
    val doubler = (r:Int) => {r*2}
    doubler
  }
  
  //ananymous funtion
  (i:Int)=>{i*2}
  //purppose of ananymous function
  //for a one time usgae//
  
  
  //benifits the higher order functions
  //*Abstraction is first benefit
  
  val customers= Array("Anand","raj","manoj")
  def remindPay(x:String) = println("payment remind for "+x)
  
  //This will be higher order function
  customers.map(remindPay)
  
  for(cus<-customers){
    remindPay(cus)
  }
  
  //taking a function as a input
  def forEach(a:Array[String],f:String=>Unit)={
    for(cus<-customers){
    f(cus)
  }
  }
  
  def sendInvite(x:String) = println("Please attend Mr. "+x)
  println("********************************************************")
  forEach(customers,remindPay)
   println("********************************************************")
  forEach(customers,sendInvite)
}