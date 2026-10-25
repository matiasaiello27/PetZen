package com.petzen.petzen.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petzen.petzen.Entitys.HistoriaClinicaEntity;
import com.petzen.petzen.Entitys.MascotaEntity;

public interface HistoriaClinicaRepositorio extends JpaRepository<HistoriaClinicaEntity, Long>{
    
}
