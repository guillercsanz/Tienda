package com.daw2.tienda.dto;

public record CategoriaResponse(
        Long id,
        String nombre,
        Integer unidadesVendidas
) {}