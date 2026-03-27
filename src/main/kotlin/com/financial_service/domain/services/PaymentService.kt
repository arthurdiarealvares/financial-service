package com.financial_service.domain.services

import com.financial_service.app.web.dtos.request.CreatePaymentRequestDTO
import com.financial_service.domain.entities.Payments

interface PaymentService {
    fun create(createRequest: CreatePaymentRequestDTO)
    fun search(): List<Payments>
    fun delete(id: Long)
}