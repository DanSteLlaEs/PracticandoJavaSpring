package com.project.Llanos.controller;

import com.project.Llanos.DTO.UserDTO;
import com.project.Llanos.Entity.UserEntity;
import com.project.Llanos.business.UserBusiness;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController
@RequestMapping("/user")
public class UserController{

    private final UserBusiness userBusiness;

    public UserController(UserBusiness userBusiness) {
        this.userBusiness = userBusiness;
    }

    /*
     *Servicio que me trae por tipoDocumento y Docuemnto el usuario seleccionado
     *Autor : Daniel Llanos Escobar
     *fecha : 25/Agosto/2022
     */


    @ApiOperation(value="get user")
    @ApiResponses({
            @ApiResponse(code = 200,message = "OK"),
            @ApiResponse(code = 400,message = "BAD REQUEST"),
            @ApiResponse(code = 404,message = "NOT FOUND"),
            @ApiResponse(code = 500,message = "INTERNAL SERVER ERROR."),
    })
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserEntity(@PathVariable Integer id, @RequestParam Integer tipoid) {
        UserDTO response = userBusiness.logic(id,tipoid);
        return ResponseEntity.ok(response);
    }

}
