package com.certificacion.java.service.impl;

import com.certificacion.java.model.Genero;
import com.certificacion.java.repository.GeneroRepository;
import com.certificacion.java.service.GeneroService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImpl implements GeneroService {

    private final GeneroRepository generoRepository;

    public GeneroServiceImpl(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }

    @Override
    public List<Genero> getAllGeneros() {
        return generoRepository.findAll();
    }

    @Override
    public Genero getGeneroById(Integer idGenero) {
        return generoRepository.findById(idGenero).orElse(null);
    }

    @Override
    public Genero createGenero(Genero genero) {
        return generoRepository.save(genero);
    }

    @Override
    public Genero updateGenero(Integer idGenero, Genero genero) {
        if (generoRepository.existsById(idGenero)) {
            genero.setIdGenero(idGenero);
            return generoRepository.save(genero);
        }
        return null;
    }

    @Override
    public void deleteGenero(Integer idGenero) {
        generoRepository.deleteById(idGenero);
    }
}
