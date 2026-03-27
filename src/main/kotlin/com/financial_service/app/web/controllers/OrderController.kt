package com.financial_service.app.web.controllers

import com.financial_service.app.web.dtos.request.CreateOrderRequestDTO
import com.financial_service.domain.entities.Orders
import com.financial_service.domain.services.OrderService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

//TODO(Add Swagger)

@RestController
@RequestMapping("/order")
class OrderController(
    private val orderService: OrderService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(request: CreateOrderRequestDTO) {
        orderService.create(request)
    }

    @PostMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    fun search(): List<Orders>{
        return orderService.search()
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: String){
        orderService.delete(id.toLong())
    }
}