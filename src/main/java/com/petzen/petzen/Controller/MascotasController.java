package com.petzen.petzen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petzen.petzen.Entitys.MascotasEntity;
import com.petzen.petzen.Models.MascotasDTO;
import com.petzen.petzen.Servicios.MascotaServicio;

@RestController
@RequestMapping("/Mascotas")
public class MascotasController {

    @Autowired
    MascotaServicio servicio;

    @GetMapping("/vertodos")
    public List<MascotasEntity> verTodos() {
        return servicio.verTodos();
    }
}
