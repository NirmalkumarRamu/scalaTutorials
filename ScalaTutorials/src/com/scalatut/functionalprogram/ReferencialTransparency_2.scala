package com.scalatut.functionalprogram

object ReferencialTransparency extends App {
    def ref(k:Int)={
      Math.sqrt(4)*k
    }
    
    println(ref(5))
    
    //substitue the Math.sqrt function with 2 
    def refre(k:Int)={
      2*k
    }
    
    println(refre(5)) //it is giving the same result,...
    
    
}