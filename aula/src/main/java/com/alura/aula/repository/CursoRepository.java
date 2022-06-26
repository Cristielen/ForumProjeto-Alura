package com.alura.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.aula.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nomeCurso);

}
