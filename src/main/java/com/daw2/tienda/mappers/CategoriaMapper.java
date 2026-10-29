package com.daw2.tienda.mappers;

import com.daw2.tienda.dto.CategoriaResponse;
import com.daw2.tienda.models.Categoria;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class CategoriaMapper {



    public CategoriaResponse toResponse(Categoria c) {

        return new CategoriaResponse(c.id(), c.nombre(), c.unidadesVendidas());

    }



    public List<CategoriaResponse> toResponse(List<Categoria> categorias) {

        return categorias.stream().map(this::toResponse).toList();

    }

}