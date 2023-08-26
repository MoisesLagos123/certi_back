package com.certificacion.java.service;

import com.certificacion.java.model.Calificacion;

import java.util.List;

public interface CalificacionService {
    List<Calificacion> getAllCalificaciones();
    Calificacion getCalificacionById(Integer idCalificacion);
    Calificacion createCalificacion(Calificacion calificacion);
    Calificacion updateCalificacion(Integer idCalificacion, Calificacion calificacion);
    void deleteCalificacion(Integer idCalificacion);
}
