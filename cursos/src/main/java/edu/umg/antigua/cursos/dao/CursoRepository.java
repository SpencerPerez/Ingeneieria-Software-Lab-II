package edu.umg.antigua.cursos.dao;

import edu.umg.antigua.cursos.models.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso,Long> {
}
