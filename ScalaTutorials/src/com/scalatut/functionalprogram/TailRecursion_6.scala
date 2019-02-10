package com.scalatut.functionalprogram

object TailRecursion_6 extends App{
  /*how to approach recursion
   * 1.identify the list
   * 2.implement the termnation ocnd
   * 3.compute the head and recurse with tail   * 
   * */
  
  //tail recursion is function call performed as a last action
  def tailrecurFact(n:Int,f:Int){
    if(n==1){
      f
    }else {
      tailrecurFact(n-1,n*f)
    }
  }
}