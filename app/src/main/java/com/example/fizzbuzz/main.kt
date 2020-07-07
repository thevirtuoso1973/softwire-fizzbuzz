package com.example.fizzbuzz

import java.util.*

fun main() {
    val read = Scanner(System.`in`)
    print("Enter number: ")
    val end: Int = read.nextInt()
    for (i in 1..end) {
        var some = false
        if (i % 17 == 0) {
            if (i % 11 == 0) {
                print("Bong")
                if (i % 13 == 0) {
                    print("Fezz")
                }
                some = true
            } else {
                if (i % 7 == 0) {
                    print("Bang")
                    some = true
                }
                if (i % 5 == 0) {
                    print("Buzz")
                    some = true
                }
                if (i % 13 == 0) {
                    print("Fezz")
                    some = true
                }
                if (i % 3 == 0) {
                    print("Fizz")
                    some = true
                }
            }
        } else {
            if (i % 11 == 0) {
                if (i % 13 == 0) {
                    print("Fezz")
                }
                print("Bong")
                some = true
            } else {
                if (i % 3 == 0) {
                    print("Fizz")
                    some = true
                }
                if (i % 13 == 0) {
                    print("Fezz")
                    some = true
                }
                if (i % 5 == 0) {
                    print("Buzz")
                    some = true
                }
                if (i % 7 == 0) {
                    print("Bang")
                    some = true
                }
            }
        }
        if (!some) {
            print(i)
        }
        println()
    }
}

