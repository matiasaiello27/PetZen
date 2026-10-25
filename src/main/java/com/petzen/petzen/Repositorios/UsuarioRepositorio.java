package com.petzen.petzen.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petzen.petzen.Entitys.UsuarioEntity;

@Repository 
public interface UsuarioRepositorio extends JpaRepository<UsuarioEntity, String>{
    List<UsuarioEntity> findByEmail(String email);

}
