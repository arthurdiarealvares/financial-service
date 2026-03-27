package com.financial_service.domain.entities

import com.financial_service.app.web.dtos.request.CreateOrderRequestDTO
import com.financial_service.domain.commons.enums.OrderStatus
import com.financial_service.domain.commons.enums.OriginSystem
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Entity
data class Orders(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    val externalId: String,
    val productId: String,
    @Enumerated(EnumType.STRING) val originSystem: OriginSystem,
    val value: Double,
    val quantity: Int,
    @Enumerated(EnumType.STRING) val status: OrderStatus,
    val paymentId: Long? = null,
    val createdAt: LocalDateTime
) {
    companion object {
        fun fromDTO(dto: CreateOrderRequestDTO) = Orders(
            externalId = dto.externalId!!,
            productId = dto.productId!!,
            originSystem = OriginSystem.valueOf(dto.originSystem!!),
            value = dto.value!!,
            quantity = dto.quantity!!,
            status = OrderStatus.CREATED,
            createdAt = LocalDateTime.parse(dto.createdAt!!, DateTimeFormatter.ISO_DATE_TIME)
        )
    }
}