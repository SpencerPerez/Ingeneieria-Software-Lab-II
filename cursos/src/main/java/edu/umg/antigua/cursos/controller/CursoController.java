package edu.umg.antigua.cursos.controller;

import edu.umg.antigua.cursos.models.Curso;
import edu.umg.antigua.cursos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;
    @GetMapping("/buscarTodos")
    public List<Curso> buscarTodos(){
        return this.cursoService.buscarTodo();
    }
    @PostMapping("/registrar")
    public  Curso registrar(@RequestBody(required = true) Curso newCurso){
        return this.cursoService.registrar(newCurso);
    }
}
