package com.certificacion.java.controller;

import com.certificacion.java.model.Genero;
import com.certificacion.java.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/generos")
public class GeneroController {

    private final GeneroService generoService;
    @Autowired
    public GeneroController(GeneroService generoService) {
        this.generoService = generoService;
    }

    @GetMapping
    public List<Genero> getAllGeneros() {
        return generoService.getAllGeneros();
    }

    @GetMapping("/{id}")
    public Genero getGeneroById(@PathVariable Integer id) {
        return generoService.getGeneroById(id);
    }

    @PostMapping
    public Genero createGenero(@RequestBody Genero genero) {
        return generoService.createGenero(genero);
    }

    @PutMapping("/{id}")
    public Genero updateGenero(@PathVariable Integer id, @RequestBody Genero genero) {
        return generoService.updateGenero(id, genero);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGenero(@PathVariable Integer id) {
        generoService.deleteGenero(id);
        return ResponseEntity.noContent().build();
    }
}
