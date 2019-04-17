package edu.umg.antigua.estudiantes.service;

import edu.umg.antigua.estudiantes.dao.EstudianteRepository;
import edu.umg.antigua.estudiantes.models.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;

    public List<Estudiante> buscarTodo(){
        return (List<Estudiante> this.estudianteRepository.findAll())
    }
    public  Estudiante registrar(Estudiante Estudiante){
        return this.estudianteRepository.save(Estudiante);
    }
}