package com.ltts.kotlindemo

fun main()
{
    var quantity=Integer.valueOf(readLine())
    var unitprice=Integer.valueOf(readLine())
    var total=quantity*unitprice
    var discount:Float= ((total*15)/100).toFloat()
    var finalbill=total-discount
    println("The discount amount is: $discount")
    println("The final bill amount is: $finalbill")
}