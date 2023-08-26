package com.certificacion.java.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Column(name = "nombreusuario")
    private String nombreUsuario;
    @Column(name = "correoelectronico")
    private String correoElectronico;
    @Column(name = "contrasena")
    private String contrasena;
}
