package com.certificacion.java.repository;

import com.certificacion.java.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository  // Indica que esta interfaz es un repositorio
@EnableJpaRepositories  // Habilita la configuración de repositorios JPA
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Extiende JpaRepository para realizar operaciones CRUD en la entidad Usuario
    // El segundo parámetro, Integer, representa el tipo de dato de la clave primaria
}