package com.financial_service.domain.services

import com.financial_service.app.web.dtos.request.CreateOrderRequestDTO
import com.financial_service.domain.entities.Orders

interface OrderService {
    fun create(request: CreateOrderRequestDTO)
    fun search(): List<Orders>
    fun delete(id: Long)
}