package com.petzen.petzen.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petzen.petzen.Entitys.ClientesEntity;
import com.petzen.petzen.Mappers.ClienteMapper;
import com.petzen.petzen.Models.ClientesDTO;
import com.petzen.petzen.Servicios.ClienteServicio;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/cliente")
public class ClientesController {
    @Autowired
    ClienteServicio servicio;

    @GetMapping("/vertodos")
    public List<ClientesDTO> verTodos() {
        return servicio.buscarTodos().stream().map(ClienteMapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/verpordni")
    public ResponseEntity<ClientesDTO> verPorId(@RequestParam String dni) {
        ClientesEntity cliente = servicio.buscarPorDni(dni);

        if (cliente == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(ClienteMapper.toDto(cliente));

    }

    @PostMapping("/insertar")
    public ResponseEntity<ClientesDTO> insertarCliente(@RequestBody ClientesDTO cliente) {
        ClientesEntity entity = ClienteMapper.toEntity(cliente);

        ClientesEntity guardado = servicio.registrarClientes(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(ClienteMapper.toDto(guardado));

    }

    @PatchMapping("/actualizar")
    public ResponseEntity<ClientesDTO> actualizarCliente(@RequestBody ClientesDTO dto) {
        ClientesEntity entity = ClienteMapper.toEntity(dto);

        ClientesEntity actualizado = servicio.actualizarCliente(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(ClienteMapper.toDto(actualizado));
    }

}
