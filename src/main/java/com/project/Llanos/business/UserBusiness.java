package com.project.Llanos.business;

import com.project.Llanos.DTO.UserDTO;
import com.project.Llanos.Entity.UserEntity;
import com.project.Llanos.Exception.UserNotFoundException;
import com.project.Llanos.Mapper.UserMapper;
import com.project.Llanos.Repository.UserRepository;
import io.swagger.annotations.ApiResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

@Service
public class UserBusiness {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserBusiness.class);
    private final UserRepository userRepository;

    public UserBusiness(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public UserDTO logic(Integer id, Integer tipoid){
        LOGGER.info("Iniciando búsqueda de usuario con documento: {}", tipoid);

        // Si no existe, disparamos la excepción de inmediato. ¡Adiós a los ifs redundantes!
        UserEntity userEntity = userRepository.findByDocumento(tipoid)
                .orElseThrow(() -> new UserNotFoundException("Usuario con documento " + tipoid + " no fue encontrado."));

        LOGGER.info("Usuario encontrado en BD. Mapeando a DTO...");

        // Retornamos el DTO usando nuestro mapeador
        return UserMapper.toDTO(userEntity);
    }
}