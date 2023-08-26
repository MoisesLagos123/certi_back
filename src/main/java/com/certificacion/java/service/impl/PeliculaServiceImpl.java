package com.certificacion.java.service.impl;

import com.certificacion.java.model.Pelicula;
import com.certificacion.java.repository.PeliculaRepository;
import com.certificacion.java.service.PeliculaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    private final PeliculaRepository peliculaRepository;

    public PeliculaServiceImpl(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    @Override
    public List<Pelicula> getAllPeliculas() {
        return peliculaRepository.findAll();
    }

    @Override
    public Pelicula getPeliculaById(Integer idPelicula) {
        return peliculaRepository.findById(idPelicula).orElse(null);
    }

    @Override
    public Pelicula createPelicula(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    @Override
    public Pelicula updatePelicula(Integer idPelicula, Pelicula pelicula) {
        if (peliculaRepository.existsById(idPelicula)) {
            pelicula.setIdPelicula(idPelicula);
            return peliculaRepository.save(pelicula);
        }
        return null;
    }

    @Override
    public void deletePelicula(Integer idPelicula) {
        peliculaRepository.deleteById(idPelicula);
    }
}
