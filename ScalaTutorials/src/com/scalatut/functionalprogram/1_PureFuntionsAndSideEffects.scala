package com.scalatut.functionalprogram
//the input determines the output
//The funtion doesn't vhnage its input
//The funtion doesn't do anything else except computing the output

object PureFuntionsAndSideEffects extends App{
  println(Math.sqrt(4))
  //side effects
  var g=10
    //function changes the values out of its scope
    def rt(i:Int)={
       g=g+i
    }
    rt(5)
    println(g)
  
}

//Pure fun advanta
//safe way of programmiing
//composable and modular Ex:read.parquet.format()
//Easy to test
//memoizable Ex:can cache the output
// can be lazy