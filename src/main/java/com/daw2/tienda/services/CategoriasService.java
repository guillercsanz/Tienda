package com.daw2.tienda.services;



import com.daw2.tienda.dto.CategoriaResponse;

import java.util.List;

public interface CategoriasService {

    List<CategoriaResponse> findAll();

    CategoriaResponse findById(Long id);

}
