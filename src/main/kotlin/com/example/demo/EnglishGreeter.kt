package com.example.demo

import org.springframework.stereotype.Component

class EnglishGreeter : Greeter {
    override fun hello(name: String): String =
            "Hello,$name!"
}