package com.example.example.client

// works fine in client but fails in ServerKotlin
import com.example.example.common.FooJava
import com.example.example.common.FooKotlin

class ClientKotlin {
	val j = FooJava()
	val k = FooKotlin()
}
