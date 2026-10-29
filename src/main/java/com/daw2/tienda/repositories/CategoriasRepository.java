package com.daw2.tienda.repositories;

import com.daw2.tienda.models.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriasRepository {

    List<Categoria> findAll();

    Optional<Categoria> findById(Long id);

    Optional<Categoria> findByNombre(String nombre);

    /** Suma unidades al contador de ventas. Devuelve las filas afectadas. */
    int sumarVendidas(Long id, int cantidad);
}
