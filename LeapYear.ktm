package com.ltts.kotlindemo

import java.util.*;
fun main(args: Array<String>) {
    var scan=Scanner(System.`in`)
    println("Enter year to check leap")
    var year=scan.nextInt()
    var leap : Int

    if (year % 4 == 0) {

        if (year % 100 == 0) {

            if (year % 400 == 0)
                leap = 1
            else
                leap = 0
        }
        else
            leap = 1
    }
    else
        leap = 0

    if (leap==1)
        println("$year  is a leap year.")
    else
        println("$year is not a leap year.")
}