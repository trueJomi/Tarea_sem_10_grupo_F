package com.example.colegioapicursos.domain.repositorios;

import com.example.colegioapicursos.domain.entidades.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCurso extends JpaRepository<Curso, Integer> {

}