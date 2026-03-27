package com.financial_service.domain.services

import com.financial_service.app.web.dtos.request.CreateOrderRequestDTO
import com.financial_service.app.web.dtos.response.SearchOrderResponseDTO

interface OrderService {
    fun create(request: CreateOrderRequestDTO)
    fun search(): List<SearchOrderResponseDTO>
    fun delete(id: Long)
}