package com.financial_service.domain.commons.extensions

import org.slf4j.LoggerFactory

inline fun <reified T> logger() =
    LoggerFactory.getLogger(T::class.java)