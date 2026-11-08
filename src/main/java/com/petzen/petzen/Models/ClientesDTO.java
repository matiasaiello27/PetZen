package com.petzen.petzen.Models;

public class ClientesDTO extends PersonasDTO {
    private String direccion;

    public ClientesDTO(String dni, String nombre, String apellido1, String apellido2, String email, String direccion,
            String telefono) {
        super(dni, nombre, apellido1, apellido2, email, telefono);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
