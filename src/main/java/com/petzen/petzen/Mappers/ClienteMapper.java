package com.petzen.petzen.Mappers;

import com.petzen.petzen.Entitys.ClientesEntity;
import com.petzen.petzen.Models.ClienteDTO;

public class ClienteMapper {
    public static ClienteDTO toDto(ClientesEntity cliente) {
        return new ClienteDTO(cliente.getDni(), cliente.getNombre(), cliente.getApellido1(), cliente.getApellido2(),
                                cliente.getDireccion(), cliente.getEmail()); 
    }


    public static ClientesEntity toEntity(ClienteDTO cliente) {
        return new ClientesEntity(cliente.getDni(), cliente.getNombre(), cliente.getApellido1(), cliente.getApellido2(),
                                cliente.getDireccion(), cliente.getEmail()); 
    }

}
