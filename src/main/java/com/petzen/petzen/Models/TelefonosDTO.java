package com.petzen.petzen.Models;

public class TelefonosDTO {

    private Long id;
    private String nombre;
    private Byte id_tipo_telefono;
    private String dni_cliente;

    public TelefonosDTO() {

    }

    public TelefonosDTO(Long id, String nombre, Byte id_tipo_telefono, String dni_cliente) {
        this.id = id;
        this.nombre = nombre;
        this.id_tipo_telefono = id_tipo_telefono;
        this.dni_cliente = dni_cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Byte getId_tipo_telefono() {
        return id_tipo_telefono;
    }

    public void setId_tipo_telefono(Byte id_tipo_telefono) {
        this.id_tipo_telefono = id_tipo_telefono;
    }

    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

}
