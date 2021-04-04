package com.ltts.kotlindemo

import java.util.*;

fun main()
{
    val sc=Scanner(System.`in`)
    println("Enter the radius of the circle")
    val radius=sc.nextInt()
    val area=3.14*radius*radius
    println("Area of the given cirlce is $area")
    val perimeter=2*3.14*radius
    println("Perimeter of the gicen circle is $perimeter")
    val lenOfSquare=perimeter/4
    println("Length of side of the square is $lenOfSquare")

}