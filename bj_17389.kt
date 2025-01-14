package com

import java.io.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    val str = br.readLine()
    var bns = 0
    var res = 0
    for(i in 0..<num){
        val cr = str.get(i)
        if(cr == 'O'){
            res += i+1+bns
            bns++
        }
        else if(cr == 'X'){bns=0}
    }
    println(res)
}