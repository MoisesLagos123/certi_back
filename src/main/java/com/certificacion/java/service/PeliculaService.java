package com.certificacion.java.service;

import com.certificacion.java.model.Pelicula;

import java.util.List;

public interface PeliculaService {
    List<Pelicula> getAllPeliculas();
    Pelicula getPeliculaById(Integer idPelicula);
    Pelicula createPelicula(Pelicula pelicula);
    Pelicula updatePelicula(Integer idPelicula, Pelicula pelicula);
    void deletePelicula(Integer idPelicula);
}
