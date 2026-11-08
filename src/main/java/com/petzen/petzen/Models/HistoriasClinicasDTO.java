package com.petzen.petzen.Models;

import java.time.LocalDate;

public class HistoriasClinicasDTO {

    private Long id;
    private LocalDate fecha_hora;
    private Double temperatura;
    private Double peso;
    private String sintomas;
    private String diagnostico;
    private String tratamiento;

    public HistoriasClinicasDTO() {

    }

    public HistoriasClinicasDTO(Long id, LocalDate fecha_hora, Double temperatura, Double peso, String sintomas,
            String diagnostico, String tratamiento) {
        this.id = id;
        this.fecha_hora = fecha_hora;
        this.temperatura = temperatura;
        this.peso = peso;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDate fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

}
