package com.daw2.tienda.services;

import com.daw2.tienda.dto.ProductoCreateRequest;
import com.daw2.tienda.dto.ProductoResponse;
import com.daw2.tienda.dto.ProductoUpdateRequest;
import com.daw2.tienda.dto.VentaRequest;
import com.daw2.tienda.services.CategoriasService;

import java.util.List;
import java.util.Optional;

public interface ProductosService {
    List<ProductoResponse> findAll(Optional<String> categoria,
                                   Optional<String> nombre,
                                   Optional<Boolean> conStock);
    ProductoResponse findById(Long id);
    ProductoResponse save(ProductoCreateRequest request);
    ProductoResponse update(Long id, ProductoUpdateRequest request);
    void deleteById(Long id);
    ProductoResponse vender(Long id, VentaRequest request);
}
