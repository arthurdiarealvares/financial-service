package com.financial_service.app.web.controllers

import com.financial_service.app.web.dtos.request.CreatePaymentRequestDTO
import com.financial_service.domain.entities.Payments
import com.financial_service.domain.services.PaymentService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

//TODO(Add Swagger)

@RestController
@RequestMapping("/payment")
class PaymentController(
    private val paymentService: PaymentService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(request: CreatePaymentRequestDTO) {
        paymentService.create(request)
    }

    @PostMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    fun search(): List<Payments>{
        return paymentService.search()
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: String){
        paymentService.delete(id.toLong())
    }
}