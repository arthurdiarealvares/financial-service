package com.financial_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FinancialServiceApplication

fun main(args: Array<String>) {
	runApplication<FinancialServiceApplication>(*args)
}
