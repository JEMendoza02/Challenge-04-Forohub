package com.alura.johanmendoza.forohub.repository;

import com.alura.johanmendoza.forohub.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
