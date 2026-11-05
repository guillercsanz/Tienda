package com.daw2.tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
@EnableCaching
@SpringBootApplication

                    // ← sin esto, lo de abajo no hace nada

public class TiendaApplication {

    public static void main(String[] args) {

        SpringApplication.run(TiendaApplication.class, args);

    }

}
