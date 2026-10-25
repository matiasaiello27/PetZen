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
import com.petzen.petzen.Repositorios.ClienteRepositorio;

@Service 
public class ClienteServicio{
    @Autowired 
    ClienteRepositorio clienteRepo;

    public List<ClientesEntity> buscarTodos() {
       return clienteRepo.findAll();
    }

    public ClientesEntity buscarPorDni(String dni) {
        return clienteRepo.findByDni(dni).orElse(null);
    }

    public ClientesEntity registrarClientes(ClientesEntity cliente) {
        
        if(clienteRepo.findByDni(cliente.getDni()).isPresent()) {
            throw new RuntimeException("El cliente con dni "+cliente.getDni()+" ya existe en nuestra base de datos");
        }

        return clienteRepo.save(cliente);
    }

 
    
}
