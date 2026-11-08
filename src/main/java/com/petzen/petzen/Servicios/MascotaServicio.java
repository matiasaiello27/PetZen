package com.petzen.petzen.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petzen.petzen.Entitys.MascotasEntity;
import com.petzen.petzen.Models.MascotasDTO;
import com.petzen.petzen.Repositorios.MascotaRepositorio;

@Service
public class MascotaServicio {

    @Autowired
    MascotaRepositorio repositorio;

    public List<MascotasEntity> verTodos() {
        return repositorio.findAll();
    }

    public Optional<MascotasEntity> verPorId(Long id) {
        Optional<MascotasEntity> mascota = repositorio.findById(id);

        if (mascota.isEmpty()) {
            throw new RuntimeException("La mascota con el ID " + id + " no se encuentra en nuestra base de datos.");
        }

        return mascota;
    }

    public MascotasEntity registrarMascota(MascotasEntity mascota) {
        if (repositorio.findById(mascota.getId()).isPresent()) {
            throw new RuntimeException(
                    "La mascota con ID " + mascota.getId() + " ya se encuentra registrada en nuestra base de datos.");
        }

        return repositorio.save(mascota);
    }

    public String borrarMascota(Long id) {
        if (repositorio.findById(id).isEmpty()) {
            throw new RuntimeException(
                    "La mascota con ID " + id + " ya se encuentra registrada en nuestra base de datos.");
        }

        repositorio.deleteById(id);
        return "La masocta don ID " + id + " ah sido borrada con éxito.";
    }

    public MascotasEntity actualizarMascota(MascotasEntity mascota) {
        Optional<MascotasEntity> existe = repositorio.findById(mascota.getId());
        if (existe.isEmpty()) {
            throw new RuntimeException(
                    "La mascota con el ID " + mascota.getId() + " no se encuentra en nuestra base de datos.");
        }
        MascotasEntity actualizarEntity = existe.get();

        if (mascota.getId() != null)
            actualizarEntity.setId(mascota.getId());

        if (mascota.getNombre() != null)
            actualizarEntity.setNombre(mascota.getNombre());

        if (mascota.getEspecie() != null)
            actualizarEntity.setEspecie(mascota.getEspecie());

        if (mascota.getFecha_nacimiento() != null)
            actualizarEntity.setFecha_nacimiento(mascota.getFecha_nacimiento());

        if (mascota.getNumero_chip() != null)
            actualizarEntity.setNumero_chip(mascota.getNumero_chip());

        if (mascota.getRaza() != null)
            actualizarEntity.setRaza(mascota.getRaza());

        if (mascota.getSexo() != null)
            actualizarEntity.setSexo(mascota.getSexo());

        return repositorio.save(actualizarEntity);
    }
}
