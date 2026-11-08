package com.petzen.petzen.Repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petzen.petzen.Entitys.MascotasEntity;

@Repository 
public interface MascotaRepositorio extends JpaRepository<MascotasEntity, Long> {
    Optional<MascotasEntity> findById(Long id);
}
