package com.certificacion.java.controller;

import com.certificacion.java.model.Pelicula;
import com.certificacion.java.service.PeliculaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
@CrossOrigin("http://localhost:4200")
public class PeliculaController {

    private final PeliculaService peliculaService;

    public PeliculaController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    @GetMapping
    public List<Pelicula> getAllPeliculas() {
        return peliculaService.getAllPeliculas();
    }

    @GetMapping("/{id}")
    public Pelicula getPeliculaById(@PathVariable Integer id) {
        return peliculaService.getPeliculaById(id);
    }

    @PostMapping
    public Pelicula createPelicula(@RequestBody Pelicula pelicula) {
        return peliculaService.createPelicula(pelicula);
    }

    @PutMapping("/{id}")
    public Pelicula updatePelicula(@PathVariable Integer id, @RequestBody Pelicula pelicula) {
        return peliculaService.updatePelicula(id, pelicula);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePelicula(@PathVariable Integer id) {
        peliculaService.deletePelicula(id);
        return ResponseEntity.noContent().build();
    }
}
