package com.certificacion.java.service;

import com.certificacion.java.model.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> getAllUsuarios();
    Usuario getUsuarioById(Integer idUsuario);
    Usuario createUsuario(Usuario usuario);
    Usuario updateUsuario(Integer idUsuario, Usuario usuario);
    void deleteUsuario(Integer idUsuario);
}
