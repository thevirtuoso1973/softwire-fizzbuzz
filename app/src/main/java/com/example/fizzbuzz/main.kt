package com.example.fizzbuzz

import java.util.*

fun main() {
    val out = StringBuilder()

    val read = Scanner(System.`in`)
    print("Enter max number (inclusive): ")
    val end: Int = read.nextInt()

    for (i in 1..end) {
        var some = false
        if (i % 17 == 0) {
            if (i % 11 == 0) {
                out.append("Bong")
                if (i % 13 == 0) {
                    out.append("Fezz")
                }
                some = true
            } else {
                if (i % 7 == 0) {
                    out.append("Bang")
                    some = true
                }
                if (i % 5 == 0) {
                    out.append("Buzz")
                    some = true
                }
                if (i % 13 == 0) {
                    out.append("Fezz")
                    some = true
                }
                if (i % 3 == 0) {
                    out.append("Fizz")
                    some = true
                }
            }
        } else {
            if (i % 11 == 0) {
                if (i % 13 == 0) {
                    out.append("Fezz")
                }
                out.append("Bong")
                some = true
            } else {
                if (i % 3 == 0) {
                    out.append("Fizz")
                    some = true
                }
                if (i % 13 == 0) {
                    out.append("Fezz")
                    some = true
                }
                if (i % 5 == 0) {
                    out.append("Buzz")
                    some = true
                }
                if (i % 7 == 0) {
                    out.append("Bang")
                    some = true
                }
            }
        }
        if (!some) {
            out.append(i)
        }
        out.append('\n')
    }
    print(out.toString())
}

