package com.certificacion.java.repository;

import com.certificacion.java.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface GeneroRepository extends JpaRepository<Genero, Integer> {
}
