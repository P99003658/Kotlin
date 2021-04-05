package com.ltts.kotlindemo

import java.util.*;
fun main(args: Array<String>) {
    var scan=Scanner(System.`in`)
    println("Enter no.of digits you want for fibonacci")
    var fibo=scan.nextInt()
    var f1=0
    var f2=1
    var i=1
    if(fibo==1)
    {
        print("0  ")
    }
    else if(fibo==2)
    {
        print("$f1  ")
        print("$f2  ")
    }
    else
    {
        print("$f1 ")
        print("$f2 ")
        while(i<=fibo-2)
        {
            var sum=f1+f2
            print("$sum  ")
            f1=f2
            f2=sum
            i++
        }
    }
}