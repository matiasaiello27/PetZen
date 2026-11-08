package com.petzen.petzen.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petzen.petzen.Entitys.UsuariosEntity;

@Repository 
public interface UsuarioRepositorio extends JpaRepository<UsuariosEntity, String>{
    List<UsuariosEntity> findByEmail(String email);

}
