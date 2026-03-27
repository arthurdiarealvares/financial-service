package com.financial_service.domain.entities

import com.financial_service.domain.commons.enums.Currency
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
data class Payments(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val externalId: String,
    val paidValue: Double,
    @Enumerated(EnumType.STRING) val currency: Currency
)