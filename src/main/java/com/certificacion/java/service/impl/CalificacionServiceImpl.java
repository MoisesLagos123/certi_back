package com.certificacion.java.service.impl;

import com.certificacion.java.model.Calificacion;
import com.certificacion.java.repository.CalificacionRepository;
import com.certificacion.java.service.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalificacionServiceImpl implements CalificacionService {
    private final CalificacionRepository calificacionRepository;
    @Autowired
    public CalificacionServiceImpl(CalificacionRepository calificacionRepository) {
        this.calificacionRepository = calificacionRepository;
    }

    @Override
    public List<Calificacion> getAllCalificaciones() {
        return calificacionRepository.findAll();
    }

    @Override
    public Calificacion getCalificacionById(Integer idCalificacion) {
        return calificacionRepository.findById(idCalificacion).orElse(null);
    }

    @Override
    public Calificacion createCalificacion(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    @Override
    public Calificacion updateCalificacion(Integer idCalificacion, Calificacion calificacion) {
        if (calificacionRepository.existsById(idCalificacion)) {
            calificacion.setIdCalificacion(idCalificacion);
            return calificacionRepository.save(calificacion);
        }
        return null;
    }

    @Override
    public void deleteCalificacion(Integer idCalificacion) {
        calificacionRepository.deleteById(idCalificacion);
    }
}
