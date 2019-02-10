package com.scalatut.functionalprogram

object Immutability_5 extends App{
  //unable to change
  val a=10
  var k=11
  // throw error
/*  a=14*/
  //can reassign the var
  k=19
  println(k)
  
  //helps to avoid varioous problem in multithreading program
  //Mathamatical approach
  
  def factorial(in:Int):Int={
    if(in==1){
     1
    }
    else {
     in*factorial(in-1)
    }
  }
  
  println(factorial(5))
  
}