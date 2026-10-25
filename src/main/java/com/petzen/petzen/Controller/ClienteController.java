package com.petzen.petzen.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petzen.petzen.Entitys.ClientesEntity;
import com.petzen.petzen.Mappers.ClienteMapper;
import com.petzen.petzen.Models.ClienteDTO;
import com.petzen.petzen.Repositorios.ClienteRepositorio;
import com.petzen.petzen.Servicios.ClienteServicio;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.annotations.Audited;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController 
@RequestMapping ("/cliente")
public class ClienteController {
    @Autowired 
    ClienteServicio servicio;

    @GetMapping("/todos")
    public List<ClienteDTO> verTodos() {
        return servicio.buscarTodos().stream().map(ClienteMapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/verpordni")
    public ResponseEntity<ClienteDTO> verPorId(@RequestParam String dni) {
       ClientesEntity cliente = servicio.buscarPorDni(dni);

       if(cliente == null) {
            return ResponseEntity.notFound().build();
       }

       return ResponseEntity.ok(ClienteMapper.toDto(cliente));
       
    }

    @PostMapping("/insertar")
    public ResponseEntity<ClienteDTO> insertarCliente(@RequestBody ClienteDTO cliente) {
        ClientesEntity nuevo = ClienteMapper.toEntity(cliente);

        ClientesEntity guardado = servicio.registrarClientes(nuevo);
        return ResponseEntity.status(HttpStatus.CREATED).body(ClienteMapper.toDto(guardado));
        
    }
    
    
    
}
