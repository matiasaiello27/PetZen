package com.petzen.petzen.Models;

import java.time.LocalDate;

import com.petzen.petzen.Enums.Sexo;

public class MascotasDTO {

    private Long id;
    private String numero_chip;
    private String especie;
    private String raza;
    private LocalDate fecha_nacimiento;
    private Sexo sexo;

    public MascotasDTO() {

    }

    public MascotasDTO(Long id, String numero_chip, String especie, String raza, LocalDate fecha_nacimiento,
            Sexo sexo) {
        this.id = id;
        this.numero_chip = numero_chip;
        this.especie = especie;
        this.raza = raza;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero_chip() {
        return numero_chip;
    }

    public void setNumero_chip(String numero_chip) {
        this.numero_chip = numero_chip;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

}
