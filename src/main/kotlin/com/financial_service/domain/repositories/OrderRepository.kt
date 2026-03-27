package com.financial_service.domain.repositories

import com.financial_service.domain.entities.Orders
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository: JpaRepository<Orders, Long>