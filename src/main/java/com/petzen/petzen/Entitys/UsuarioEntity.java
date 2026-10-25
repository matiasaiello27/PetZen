package com.petzen.petzen.Entitys;

import com.petzen.petzen.Enums.Rol;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "usuarios")
public class UsuarioEntity {
    @Id 
    @Column (name = "dni", length = 9)
    private String dni;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "apellido1")
    private String apellido1;

    @Column (name = "apellido2")
    private String apellido2;  
    
    @Column (name = "email")
    private String email;

    @Column (name = "rol")
    private Rol rol;

    @Column (name = "activo")
    private boolean activo;

}
