package com.petzen.petzen.Repositorios;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.petzen.petzen.Entitys.*;

@Repository 
public interface ClienteRepositorio extends JpaRepository<ClientesEntity, String> {
    Optional<ClientesEntity> findByDni(String dniCliente);
    void deleteByDni(String dniCliente);
    
}