package com.financial_service.domain.entities

import com.financial_service.domain.commons.enums.OrderStatus
import com.financial_service.domain.commons.enums.OriginSystem
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
data class Orders(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val externalId: String,
    val productId: String,
    @Enumerated(EnumType.STRING) val originSystem: OriginSystem,
    val value: Double,
    val quantity: Int,
    @Enumerated(EnumType.STRING) val status: OrderStatus,
    val paymentId: Long,
    val createdAt: LocalDateTime
)