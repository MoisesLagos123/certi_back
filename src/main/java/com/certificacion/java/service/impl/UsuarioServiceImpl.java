package com.certificacion.java.service.impl;

import com.certificacion.java.model.Usuario;
import com.certificacion.java.repository.UsuarioRepository;
import com.certificacion.java.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // Indica que esta clase es un componente de servicio
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    // Constructor que inyecta el repositorio de usuarios
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        // Devuelve todos los usuarios del repositorio
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario getUsuarioById(Integer idUsuario) {
        // Devuelve un usuario por su ID o null si no existe
        return usuarioRepository.findById(idUsuario).orElse(null);
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        // Guarda un nuevo usuario en el repositorio
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario updateUsuario(Integer idUsuario, Usuario usuario) {
        // Si el usuario con el ID existe, actualiza sus datos y lo guarda en el repositorio
        if (usuarioRepository.existsById(idUsuario)) {
            usuario.setIdUsuario(idUsuario);
            return usuarioRepository.save(usuario);
        }
        return null;  // Retorna null si el usuario no existe
    }

    @Override
    public void deleteUsuario(Integer idUsuario) {
        // Elimina un usuario por su ID
        usuarioRepository.deleteById(idUsuario);
    }
}