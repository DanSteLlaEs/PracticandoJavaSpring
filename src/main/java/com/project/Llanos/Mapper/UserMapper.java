package com.project.Llanos.Mapper;

import com.project.Llanos.DTO.UserDTO;
import com.project.Llanos.Entity.UserEntity;

public class UserMapper {
    public static UserDTO toDTO(UserEntity entity) {
        if (entity == null) {
            return null;
        }

        // Formateamos el nombre completo de manera elegante
        String segundoNombre = entity.getsNombre() != null ? " " + entity.getsNombre() : "";
        String segundoApellido = entity.getsApellido() != null ? " " + entity.getsApellido() : "";
        String nombreCompleto = entity.getpNombre() + segundoNombre + " " + entity.getpApellido() + segundoApellido;

        return new UserDTO(
                entity.getId(),
                entity.getTipoDocumento(),
                entity.getDocumento(),
                nombreCompleto,
                entity.getCelular(),
                entity.getDireccion(),
                entity.getCiudadResidencia()
        );
    }
}

