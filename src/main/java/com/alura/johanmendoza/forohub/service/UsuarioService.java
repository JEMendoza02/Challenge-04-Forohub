package com.alura.johanmendoza.forohub.service;

import com.alura.johanmendoza.forohub.model.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alura.johanmendoza.forohub.model.Usuario;
import com.alura.johanmendoza.forohub.repository.UsuarioRepository;
import com.alura.johanmendoza.forohub.config.SecurityConfig;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private SecurityConfig securityConfig;

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado"));
    }
    public Usuario registrarNuevoUsuario(UsuarioDTO registroDTO) {
        Usuario usuario = new Usuario();
        usuario.setNombre(registroDTO.getNombre());
            usuario.setPassword(securityConfig.passwordEncoder().encode(registroDTO.getPassword()));
        return usuarioRepository.save(usuario);
    }

}


