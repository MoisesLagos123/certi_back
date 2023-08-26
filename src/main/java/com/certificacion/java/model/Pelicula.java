package com.certificacion.java.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private Integer idPelicula;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "anio_lanzamiento")
    private Integer anioLanzamiento;
    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Genero genero;
}
