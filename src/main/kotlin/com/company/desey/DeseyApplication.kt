package com.company.desey

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class DeseyApplication

fun main(args: Array<String>) {
	runApplication<DeseyApplication>(*args)
}
