package com.ltts.kotlindemo

import java.util.*;

fun main(){
    var scan=Scanner(System.`in`)
    println("Enter two numbers for calculation:")
    var number=scan.nextInt()
    var number2=scan.nextInt()
    println("Addition of $number and $number2 is ${(number+number2)}")
    println("Subtraction of $number and $number2 is ${(number-number2)}")
    println("Multiplication of $number and $number2 is ${(number*number2)}")
    println("Division of $number and $number2 is ${(number/number2)}")
}