package com.financial_service.domain.services.impl

import com.financial_service.app.web.dtos.request.CreateOrderRequestDTO
import com.financial_service.app.web.dtos.response.SearchOrderResponseDTO
import com.financial_service.domain.repositories.OrderRepository
import com.financial_service.domain.services.OrderService
import org.springframework.stereotype.Service

@Service
class OrderServiceImpl(
    private val repository: OrderRepository
): OrderService {
    override fun create(request: CreateOrderRequestDTO) {
        TODO("Not yet implemented")
    }

    override fun search(): List<SearchOrderResponseDTO> {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }
}