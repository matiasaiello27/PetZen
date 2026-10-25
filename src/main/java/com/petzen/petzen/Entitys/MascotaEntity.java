package com.petzen.petzen.Entitys;

import java.time.LocalDate;

import com.petzen.petzen.Enums.Sexo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "mascotas")
public class MascotaEntity {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "especie")
    private String especie;

    @Column (name = "raza")
    private String raza;

    @Column (name = "fecha_nacimiento")
    private LocalDate fecha_nacimiento;

    @Column (name = "sexo")
    private Sexo sexo;

}
