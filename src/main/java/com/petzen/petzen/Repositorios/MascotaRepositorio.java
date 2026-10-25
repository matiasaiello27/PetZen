package com.petzen.petzen.Repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petzen.petzen.Entitys.MascotaEntity;

@Repository 
public interface MascotaRepositorio extends JpaRepository<MascotaEntity, Long> {
    Optional<MascotaEntity> findById(Long id);
}
