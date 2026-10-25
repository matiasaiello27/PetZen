package com.petzen.petzen.Models;

import com.petzen.petzen.Enums.Rol;

public class UsuarioDTO extends PersonaDTO {
    private Rol rol;
    private boolean activo;

    public UsuarioDTO(String dni, String nombre, String apellido1, String apellido2, String email, Rol rol,
            boolean activo) {
        super(dni, nombre, apellido1, apellido2, email);
        this.rol = rol;
        this.activo = activo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
