package com.example.colegioapicursos.domain.servicios;

import com.example.colegioapicursos.domain.entidades.Curso;
import com.example.colegioapicursos.domain.repositorios.RepositorioCurso;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ServicioCurso {

    private RepositorioCurso repositorioCurso;

    public Curso crearCurso(Curso p){
        return this.repositorioCurso.save(p);
    }

    public Curso getCursoById(int idCurso){
        return this.repositorioCurso.findById(idCurso).orElse(null);
    }
    public List<Curso> listarCurso(){
        return this.repositorioCurso.findAll();
    }
}
