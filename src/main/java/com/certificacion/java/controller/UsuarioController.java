package com.certificacion.java.controller;

import com.certificacion.java.model.Usuario;
import com.certificacion.java.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // Indica que esta clase es un controlador REST
@RequestMapping("/api/usuarios")  // Ruta base para todas las operaciones en este controlador
@CrossOrigin("http://localhost:4200")  // Permite peticiones desde http://localhost:4200 (para evitar problemas de CORS)
public class UsuarioController {

    private final UsuarioService usuarioService;

    // Constructor que inyecta el servicio de usuarios
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping  // Mapea a las peticiones GET en /api/usuarios
    public List<Usuario> getAllUsuarios() {
        // Devuelve todos los usuarios
        return usuarioService.getAllUsuarios();
    }

    @GetMapping("/{id}")  // Mapea a las peticiones GET en /api/usuarios/{id}
    public Usuario getUsuarioById(@PathVariable Integer id) {
        // Devuelve un usuario por su ID
        return usuarioService.getUsuarioById(id);
    }

    @PostMapping  // Mapea a las peticiones POST en /api/usuarios
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        // Crea un nuevo usuario
        return usuarioService.createUsuario(usuario);
    }

    @PutMapping("/{id}")  // Mapea a las peticiones PUT en /api/usuarios/{id}
    public Usuario updateUsuario(@PathVariable Integer id, @RequestBody Usuario usuario) {
        // Actualiza un usuario existente por su ID
        return usuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")  // Mapea a las peticiones DELETE en /api/usuarios/{id}
    public ResponseEntity<Void> deleteUsuario(@PathVariable Integer id) {
        // Elimina un usuario por su ID
        usuarioService.deleteUsuario(id);
        return ResponseEntity.noContent().build();
    }
}