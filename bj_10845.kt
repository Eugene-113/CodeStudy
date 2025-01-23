package com

import java.io.*
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    val q: Queue<Int> = LinkedList()
    val nums = arrayListOf<Int>()
    var r = 0
    for(i in 0..<num){
        val str = br.readLine()
        when(str.get(1)){
            'u' -> {
                val unum = Integer.parseInt(str.substring(5))
                q.add(unum)
                r = unum
            }
            'o' -> {
                val pnum = q.poll()
                if(pnum != null) nums.add(pnum)
                else nums.add(-1)
            }
            'i' -> {
                nums.add(q.size)
            }
            'm' -> {
                if(q.isEmpty()) nums.add(1)
                else nums.add(0)
            }
            'r' -> {
                if(q.isEmpty()) nums.add(-1)
                else nums.add(q.peek())
            }
            'a' -> {
                if(q.isEmpty()) nums.add(-1)
                else nums.add(r)
            }
        }
    }
    for(i in 0..<nums.size){
        println(nums.get(i))
    }
}