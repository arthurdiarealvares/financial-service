package com.financial_service.domain.services.impl

import com.financial_service.app.web.dtos.request.CreateOrderRequestDTO
import com.financial_service.domain.commons.extensions.logger
import com.financial_service.domain.entities.Orders
import com.financial_service.domain.entities.Orders.Companion.fromDTO
import com.financial_service.domain.repositories.OrderRepository
import com.financial_service.domain.services.OrderService
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class OrderServiceImpl(
    private val repository: OrderRepository
) : OrderService {
    private val log = logger<OrderService>()

    //TODO(ASYNC)
    override fun create(request: CreateOrderRequestDTO) {
        runCatching {
            repository.save(fromDTO(request))
        }.getOrElse {
            log.info(
                "There was an error while creating order with externalId: ${request.externalId}. Message: ${it.message}"
            )
            throw it
        }
    }

    override fun search(): List<Orders> {
        return repository.findAll()
    }

    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }
}