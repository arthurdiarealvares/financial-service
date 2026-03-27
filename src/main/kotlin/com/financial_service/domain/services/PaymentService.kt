package com.financial_service.domain.services

import com.financial_service.app.web.dtos.request.CreatePaymentRequestDTO
import com.financial_service.app.web.dtos.response.SearchPaymentResponseDTO

interface PaymentService {
    fun create(createRequest: CreatePaymentRequestDTO)
    fun search(): List<SearchPaymentResponseDTO>
    fun delete(id: Long)
}