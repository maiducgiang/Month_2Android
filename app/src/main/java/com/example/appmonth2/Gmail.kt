package com.example.appmonth2

data class Mail(val avatar : Int, val name : String, val des : String, val content : String, val time : String)
data class Gmail(val from: String, val to: String, val cc: String, val bcc: String, val subject: String, val compose: String)