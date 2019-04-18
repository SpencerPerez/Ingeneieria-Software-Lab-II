package edu.umg.antigua.cursos.dao;

import edu.umg.antigua.cursos.models.Catedratico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CatedraticoRepository extends CrudRepository<Catedratico,Long> {
}
