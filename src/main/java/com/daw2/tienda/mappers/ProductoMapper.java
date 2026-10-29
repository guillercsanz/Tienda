package com.daw2.tienda.mappers;

import com.daw2.tienda.dto.ProductoCreateRequest;
import com.daw2.tienda.dto.ProductoResponse;
import com.daw2.tienda.dto.ProductoUpdateRequest;
import com.daw2.tienda.models.Producto;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class ProductoMapper {

    /** Modelo + nombre de su categoría → lo que ve el cliente. */
    public ProductoResponse toResponse(Producto p, String categoriaNombre) {
        return new ProductoResponse(
                p.id(), p.sku(), p.nombre(), p.precio(), p.stock(),
                categoriaNombre, p.createdAt(), p.updatedAt());
    }

    /** POST → modelo nuevo. El servicio ya ha resuelto el id de la categoría. */
    public Producto toModel(ProductoCreateRequest r, Long categoriaId) {
        var ahora = LocalDateTime.now();
        return new Producto(
                null,
                r.sku().trim().toUpperCase(),
                r.nombre().trim(),
                r.precio(),
                r.stock(),
                categoriaId,
                ahora,
                ahora);
    }

    /** PATCH → copia con solo lo que ha llegado distinto de null. */
    public Producto parchear(Producto original, ProductoUpdateRequest r, Long categoriaId) {
        return new Producto(
                original.id(),
                original.sku(),                                   // el SKU no se cambia
                r.nombre() != null ? r.nombre().trim() : original.nombre(),
                r.precio() != null ? r.precio()        : original.precio(),
                r.stock()  != null ? r.stock()         : original.stock(),
                categoriaId != null ? categoriaId      : original.categoriaId(),
                original.createdAt(),
                LocalDateTime.now());
    }
}