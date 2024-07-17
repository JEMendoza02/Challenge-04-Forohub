package com.alura.johanmendoza.forohub.controller;

import com.alura.johanmendoza.forohub.model.Usuario;
import com.alura.johanmendoza.forohub.model.UsuarioDTO;
import com.alura.johanmendoza.forohub.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

        @Autowired
        private UsuarioService usuarioService;

        @PostMapping("/registro")
        public ResponseEntity<?> registrarUsuario(@RequestBody UsuarioDTO registroDTO) {
            Usuario usuario = usuarioService.registrarNuevoUsuario(registroDTO);
            return ResponseEntity.ok("Usuario registrado con éxito: " + usuario.getNombre());
        }
    }


