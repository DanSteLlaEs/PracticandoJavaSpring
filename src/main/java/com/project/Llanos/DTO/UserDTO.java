package com.project.Llanos.DTO;

public record UserDTO(
        Integer id,
        String tipoDocumento,
        Integer numeroDocumento,
        String nombreCompleto,
        String celular,
        String direccion,
        String ciudad
) {}
