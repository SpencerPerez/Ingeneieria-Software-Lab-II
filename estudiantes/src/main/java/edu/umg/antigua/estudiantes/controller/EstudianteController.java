package edu.umg.antigua.estudiantes.controller;

import edu.umg.antigua.estudiantes.models.Estudiante;
import edu.umg.antigua.estudiantes.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;
    @GetMapping("/buscarTodos")
    public List<Estudiante> buscarTodos(){
        return this.estudianteService.buscarTodo();
    }
    @PostMapping("/registrar")
    public Estudiante registrar(@RequestBody (required = true) Estudiante estudiante){
        return this.estudianteService.registrar(estudiante);
    }

}
