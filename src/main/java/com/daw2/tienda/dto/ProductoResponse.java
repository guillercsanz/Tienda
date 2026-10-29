package com.daw2.tienda.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProductoResponse(
    Long id,
    String sku,
    String nombre,
    BigDecimal precio,
    Integer stock,
    String categoria,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {}
