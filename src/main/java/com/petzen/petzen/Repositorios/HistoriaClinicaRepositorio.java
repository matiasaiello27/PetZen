package com.petzen.petzen.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petzen.petzen.Entitys.HistoriasClinicasEntity;
import com.petzen.petzen.Entitys.MascotasEntity;

public interface HistoriaClinicaRepositorio extends JpaRepository<HistoriasClinicasEntity, Long>{
    
}
