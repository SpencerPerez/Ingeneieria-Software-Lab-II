package edu.umg.antigua.cursos.dao;

import edu.umg.antigua.cursos.models.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends CrudRepository<Curso,Long> {
}
