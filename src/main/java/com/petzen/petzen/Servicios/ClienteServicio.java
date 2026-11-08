package com.petzen.petzen.Servicios;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.petzen.petzen.Entitys.ClientesEntity;
import com.petzen.petzen.Mappers.ClienteMapper;
import com.petzen.petzen.Repositorios.ClienteRepositorio;

@Service
public class ClienteServicio {
    @Autowired
    ClienteRepositorio clienteRepo;

    public List<ClientesEntity> buscarTodos() {
        return clienteRepo.findAll();
    }

    public ClientesEntity buscarPorDni(String dni) {
        return clienteRepo.findByDni(dni).orElse(null);
    }

    public ClientesEntity registrarClientes(ClientesEntity cliente) {

        if (clienteRepo.findByDni(cliente.getDni()).isPresent()) {
            throw new RuntimeException(
                    "El cliente con dni " + cliente.getDni() + " ya existe en nuestra base de datos");
        }

        return clienteRepo.save(cliente);
    }

    public String borrarCliente(String dni) {
        Optional<ClientesEntity> existe = clienteRepo.findByDni(dni);
        if (existe.isEmpty()) {
            throw new RuntimeException("El cliente con dni " + dni + " no existe en nuestra base de datos.");
        }

        clienteRepo.deleteByDni(dni);
        return "El cliente con dni " + dni + " ah sido borrado con éxito.";

    }

    public ClientesEntity actualizarCliente(ClientesEntity entity) {
        Optional<ClientesEntity> existe = clienteRepo.findByDni(entity.getDni());

        if (existe.isEmpty()) {
            throw new RuntimeException(
                    "El cliente con dni " + entity.getDni() + " no existe en nuestra base de datos.");
        }

        ClientesEntity clienteExistente = existe.get();
        if (entity.getDni() != null)
            clienteExistente.setDni(entity.getDni());
        if (entity.getNombre() != null)
            clienteExistente.setNombre(entity.getNombre());
        if (entity.getApellido1() != null)
            clienteExistente.setApellido1(entity.getApellido1());
        if (entity.getApellido2() != null)
            clienteExistente.setApellido2(entity.getApellido2());
        if (entity.getDireccion() != null)
            clienteExistente.setDireccion(entity.getDireccion());
        if (entity.getEmail() != null)
            clienteExistente.setEmail(entity.getEmail());
        if (entity.getTelefono() != null)
            clienteExistente.setTelefono(entity.getTelefono());
        
        
        return clienteRepo.save(clienteExistente);
    }

}
