package com

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    var stt = 0
    var num2 = 0
    var num = st.nextToken().toInt()
    for (i in 0..6) {
        num2 = st.nextToken().toInt()
        if (stt == 1 && num > num2 || stt == 2 && num < num2) {
            stt = 3
            break
        }
        if (num < num2) {
            stt = 1
        }
        if (num > num2) {
            stt = 2
        }
        num = num2
    }
    if (stt == 1) println("ascending")
    else if (stt == 2) println("descending")
    else println("mixed")
}