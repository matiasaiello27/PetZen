package com.petzen.petzen.Models;

public class ClienteDTO extends PersonaDTO {
    private String direccion;

    public ClienteDTO(String dni, String nombre, String apellido1, String apellido2, String email, String direccion) {
        super(dni, nombre, apellido1, apellido2, email);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
