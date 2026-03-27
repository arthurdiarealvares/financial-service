package com.financial_service.app.web.controllers

import com.financial_service.app.web.dtos.request.CreateOrderRequestDTO
import com.financial_service.app.web.dtos.response.SearchOrderResponseDTO
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

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    fun search(): List<SearchOrderResponseDTO>{
        return orderService.search()
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: String){
        orderService.delete(id.toLong())
    }
}