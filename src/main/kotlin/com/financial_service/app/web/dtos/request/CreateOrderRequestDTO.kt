package com.financial_service.app.web.dtos.request

//TODO VALIDATIONS
data class CreateOrderRequestDTO(
    val externalId: String?,
    val productId: String?,
    val originSystem: String?,
    val value: Double?,
    val quantity: Int?,
    val createdAt: String?
)