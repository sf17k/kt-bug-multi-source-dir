package com.example.example.server

// IntelliJ highlights "common" in red as unresolved references
// strangely, the same code works fine in ServerJava, ClientKotlin, and ClientJava
// NOTE: "client" and "server" are just names of subprojects, there is nothing meaningful to distinguish them!

import com.example.example.common.FooJava
import com.example.example.common.FooKotlin

class ServerKotlin {
	// more unresolved references
	val j = FooJava()
	val k = FooKotlin()
}
