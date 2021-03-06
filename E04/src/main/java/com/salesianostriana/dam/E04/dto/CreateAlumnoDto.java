package com.salesianostriana.dam.E04.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class CreateAlumnoDto {

    private String nombre;
    private String apellidos;
    private String email;
    private String curso;
    private String direccion;
}
