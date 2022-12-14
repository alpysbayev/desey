package com.company.desey

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration


@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class DeseyApplication

fun main(args: Array<String>) {
	runApplication<DeseyApplication>(*args)
}
