package com.example.colegioapicursos.controladores;

import com.example.colegioapicursos.domain.entidades.Curso;
import com.example.colegioapicursos.domain.servicios.ServicioCurso;
import com.example.colegioapicursos.utils.WrapperResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("cursos")
@AllArgsConstructor
@CrossOrigin("*")
public class ControladorCurso {

    private final ServicioCurso servicioCurso;

    @PostMapping()
    public ResponseEntity<WrapperResponse<Curso>> guardarCurso(@RequestBody Curso producto){
        return new WrapperResponse<>(true, "SUCCESS", this.servicioCurso.crearCurso(producto)).createResponse();
    }

    @GetMapping
    public ResponseEntity<WrapperResponse<List<Curso>>> getAllCursos(){
        return new WrapperResponse<>(true, "SUCCESS", this.servicioCurso.listarCurso()).createResponse();
    }

}
