package com.petzen.petzen.Mappers;

import org.springframework.stereotype.Component;

import com.petzen.petzen.Entitys.ClientesEntity;
import com.petzen.petzen.Models.ClientesDTO;

@Component 
public class ClienteMapper {
    public static ClientesDTO toDto(ClientesEntity cliente) {
        return new ClientesDTO(cliente.getDni(), cliente.getNombre(), cliente.getApellido1(), cliente.getApellido2(),
                cliente.getDireccion(),  cliente.getTelefono(),cliente.getEmail());
    }

    public static ClientesEntity toEntity(ClientesDTO cliente) {
        ClientesEntity entity = new ClientesEntity();

        if (cliente.getDni() == null) {
            entity.setDni(en);
        }
    }

}
