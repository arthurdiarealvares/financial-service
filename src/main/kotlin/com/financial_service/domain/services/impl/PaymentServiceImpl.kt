package com.financial_service.domain.services.impl

import com.financial_service.app.web.dtos.request.CreatePaymentRequestDTO
import com.financial_service.domain.entities.Payments
import com.financial_service.domain.repositories.PaymentRepository
import com.financial_service.domain.services.PaymentService
import org.springframework.stereotype.Service

@Service
class PaymentServiceImpl(
    private val repository: PaymentRepository
): PaymentService {
    override fun create(createRequest: CreatePaymentRequestDTO) {
        TODO("Not yet implemented")
    }

    override fun search(): List<Payments> {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }
}