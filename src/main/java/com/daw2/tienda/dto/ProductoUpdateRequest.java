package com.daw2.tienda.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record ProductoUpdateRequest(
        @Size(max = 150) String nombre,
        @DecimalMin("0.0") BigDecimal precio,
        @PositiveOrZero Integer stock,
        String categoria
) {}

