package com.daw2.tienda.models;


public record Categoria(
        Long id,
        String nombre,
        Integer unidadesVendidas
) {}
