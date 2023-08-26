package com.certificacion.java.service;

import com.certificacion.java.model.Usuario;

import java.util.List;

// Interfaz que define los métodos para manipular usuarios
public interface UsuarioService {

    // Devuelve una lista de todos los usuarios
    List<Usuario> getAllUsuarios();

    // Devuelve un usuario por su ID
    Usuario getUsuarioById(Integer idUsuario);

    // Crea un nuevo usuario
    Usuario createUsuario(Usuario usuario);

    // Actualiza un usuario existente por su ID
    Usuario updateUsuario(Integer idUsuario, Usuario usuario);

    // Elimina un usuario por su ID
    void deleteUsuario(Integer idUsuario);
}