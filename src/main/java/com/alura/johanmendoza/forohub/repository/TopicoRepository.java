package com.alura.johanmendoza.forohub.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.alura.johanmendoza.forohub.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    boolean existsByTituloAndMensaje(String titulo, String mensaje);

}