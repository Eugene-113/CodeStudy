package com

import java.io.*
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    val strs = arrayOfNulls<String>(num)
    for(i in 0..<num){
        strs[i] = br.readLine()
    }
    for(i in 0..<num){
        var isNo = false
        val stack = Stack<Char>()
        val str = strs[i]
        for(j in 0..<str!!.length){
            val c = str!!.get(j)
            if(c == '(') stack.push(c)
            else{
                if(stack.isEmpty()){
                    println("NO")
                    isNo = true
                    break
                }
                else stack.pop()
            }
        }
        if(!isNo){
            if(stack.isEmpty()) println("YES")
            else println("NO")
        }
    }
}