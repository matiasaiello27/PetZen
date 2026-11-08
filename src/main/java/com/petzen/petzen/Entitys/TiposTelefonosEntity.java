package com.petzen.petzen.Entitys;

import com.petzen.petzen.Enums.TipoTelefono;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tipo_telefono")
@NoArgsConstructor
@AllArgsConstructor
public class TiposTelefonosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Byte id;

    @Column(name = "tipo_telefono")
    private TipoTelefono tipoTelefono;

}
