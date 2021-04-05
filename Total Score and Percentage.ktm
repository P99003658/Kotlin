package com.ltts.kotlindemo

import java.util.*;

fun main() {
    val sc = Scanner(System.`in`)
    println("Enter the marks of any three subjects")
    val s1=sc.nextInt()
    val s2=sc.nextInt()
    val s3=sc.nextInt()
    val total=s1+s2+s3
    println("Total marks Obtained is $total")
    val percent=(total*100)/300
    println("Total Percentage Obtained is $percent%")
}