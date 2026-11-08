package com.petzen.petzen.Models;

import com.petzen.petzen.Enums.TipoTelefono;

public class TiposTelefonosDTO {

    private Byte id;
    private TipoTelefono tipoTelefono;

    public TiposTelefonosDTO() {

    }

    public TiposTelefonosDTO(Byte id, TipoTelefono tipoTelefono) {
        this.id = id;
        this.tipoTelefono = tipoTelefono;
    }

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public TipoTelefono getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(TipoTelefono tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

}
