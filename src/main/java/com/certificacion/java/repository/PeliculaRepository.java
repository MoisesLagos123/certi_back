package com.certificacion.java.repository;

import com.certificacion.java.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {
}
