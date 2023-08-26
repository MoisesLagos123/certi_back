package com.certificacion.java.service;

import com.certificacion.java.model.Genero;

import java.util.List;

public interface GeneroService {
    List<Genero> getAllGeneros();
    Genero getGeneroById(Integer idGenero);
    Genero createGenero(Genero genero);
    Genero updateGenero(Integer idGenero, Genero genero);
    void deleteGenero(Integer idGenero);
}
