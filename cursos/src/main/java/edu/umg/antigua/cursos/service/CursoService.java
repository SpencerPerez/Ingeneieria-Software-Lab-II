package edu.umg.antigua.cursos.service;

import edu.umg.antigua.cursos.dao.CursoRepository;
import edu.umg.antigua.cursos.models.Curso;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CursoService {
    @Autowired
    CursoRepository cursoRepository;

    public List<Curso> buscarTodo(){
        return List<Curso> this.cursoRepository.findAll();
    }
    public Curso registrar(Curso Curso){
        return this.cursoRepository.save(Curso)
    }

}
