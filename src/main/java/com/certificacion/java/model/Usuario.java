package com.certificacion.java.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Indica que esta clase es una entidad de base de datos
@Entity(name = "usuarios")
@Data  // Lombok: Genera getters, setters, toString, equals, hashCode
@NoArgsConstructor  // Lombok: Genera constructor sin argumentos
@AllArgsConstructor  // Lombok: Genera constructor con todos los argumentos
public class Usuario {

    // Marca el campo como la clave primaria de la entidad
    @Id
    // Genera automáticamente el valor de la clave primaria usando la estrategia de identidad
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Especifica el nombre de la columna en la tabla de la base de datos
    @Column(name = "id_usuario")
    private Integer idUsuario;  // Campo para almacenar el ID del usuario

    @Column(name = "nombreusuario")
    private String nombreUsuario;  // Campo para almacenar el nombre de usuario

    @Column(name = "correoelectronico")
    private String correoElectronico;  // Campo para almacenar el correo electrónico

    @Column(name = "contrasena")
    private String contrasena;  // Campo para almacenar la contraseña
}
