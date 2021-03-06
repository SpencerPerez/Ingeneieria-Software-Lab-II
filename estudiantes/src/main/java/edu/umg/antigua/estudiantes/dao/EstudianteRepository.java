package edu.umg.antigua.estudiantes.dao;

import edu.umg.antigua.estudiantes.models.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {

}
