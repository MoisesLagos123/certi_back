package com.certificacion.java.controller;


import com.certificacion.java.model.Calificacion;
import com.certificacion.java.service.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calificaciones")
public class CalificacionController {
    private final CalificacionService calificacionService;
    @Autowired
    public CalificacionController(CalificacionService calificacionService) {
        this.calificacionService = calificacionService;
    }

    @GetMapping
    public List<Calificacion> getAllCalificaciones() {
        return calificacionService.getAllCalificaciones();
    }

    @GetMapping("/{id}")
    public Calificacion getCalificacionById(@PathVariable Integer id) {
        return calificacionService.getCalificacionById(id);
    }

    @PostMapping
    public Calificacion createCalificacion(@RequestBody Calificacion calificacion) {
        return calificacionService.createCalificacion(calificacion);
    }

    @PutMapping("/{id}")
    public Calificacion updateCalificacion(@PathVariable Integer id, @RequestBody Calificacion calificacion) {
        return calificacionService.updateCalificacion(id, calificacion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCalificacion(@PathVariable Integer id) {
        calificacionService.deleteCalificacion(id);
        return ResponseEntity.noContent().build();
    }
}
