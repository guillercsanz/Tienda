package com.daw2.tienda.services;

import com.daw2.tienda.dto.CategoriaResponse;
import com.daw2.tienda.mappers.CategoriaMapper;
import com.daw2.tienda.repositories.CategoriasRepository;
import com.daw2.tienda.repositories.ProductosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CategoriasServiceImpl implements CategoriasService {



    private final CategoriasRepository categoriasRepository;

    private final ProductosRepository productosRepository;

    private final CategoriaMapper mapper;



    public CategoriasServiceImpl(CategoriasRepository categoriasRepository,

                                 ProductosRepository productosRepository,

                                 CategoriaMapper mapper) {

        this.categoriasRepository = categoriasRepository;

        this.productosRepository = productosRepository;

        this.mapper = mapper;

    }



    @Override

    public List<CategoriaResponse> findAll() {

        return mapper.toResponse(categoriasRepository.findAll());

    }



    @Override

    public CategoriaResponse findById(Long id) {

        return categoriasRepository.findById(id)

                .map(mapper::toResponse)

                .orElseThrow(() -> new CategoriaNotFoundException(id));

    }

}