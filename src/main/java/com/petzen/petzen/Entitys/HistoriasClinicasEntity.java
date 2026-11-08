package com.petzen.petzen.Entitys;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "historia_clinica")
public class HistoriasClinicasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha_hora")
    private LocalDateTime fecha_hora;

    @Column(name = "temperatura")
    private Double temperatura;

    @Column(name = "peso")
    private Double peso;

    @Column(name = "sintomas")
    private String sintomas;

    @Column(name = "diagnostico")
    private String diagnostico;

    @Column(name = "tratamiento")
    private String tratamiento;

}
