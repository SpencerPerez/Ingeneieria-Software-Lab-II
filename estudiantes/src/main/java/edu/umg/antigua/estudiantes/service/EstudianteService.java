package edu.umg.antigua.estudiantes.service;

import edu.umg.antigua.estudiantes.dao.EstudianteRepository;
import edu.umg.antigua.estudiantes.models.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> buscarTodo(){
        return (List<Estudiante>) this.estudianteRepository.findAll();
    }
    public  Estudiante registrar(Estudiante estudiante){
        return this.estudianteRepository.save(estudiante);
    }
}
