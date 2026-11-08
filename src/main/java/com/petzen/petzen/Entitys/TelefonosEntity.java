package com.petzen.petzen.Entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "telefonos")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TelefonosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 9, message = "El número de teléfono no puede superar los 9 dígitos")
    @Column(name = "numero")
    private String numero;

    @Column(name = "id_tipo_telefono")
    private Byte id_tipo_telefono;

    @Size(max = 9, message = "El dni del cliente no puede superar los 9 carácteres")
    @Column(name = "dni_cliente")
    private String dni_cliente;

}
