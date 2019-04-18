package edu.umg.antigua.cursos.service;

import edu.umg.antigua.cursos.dao.CursoRepository;
import edu.umg.antigua.cursos.models.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;

    public List<Curso> buscarTodo(){
        return (List<Curso>) this.cursoRepository.findAll();
    }
    public Curso registrar(Curso curso){ return this.cursoRepository.save(curso);

    }

}
