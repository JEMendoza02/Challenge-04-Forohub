package com.alura.johanmendoza.forohub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alura.johanmendoza.forohub.model.Curso;
import com.alura.johanmendoza.forohub.repository.CursoRepository;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public Curso findById(Long id) {
        return cursoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));
    }
}