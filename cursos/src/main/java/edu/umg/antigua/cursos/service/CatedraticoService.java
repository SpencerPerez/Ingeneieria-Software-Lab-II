package edu.umg.antigua.cursos.service;

import edu.umg.antigua.cursos.dao.CatedraticoRepository;
import edu.umg.antigua.cursos.models.Catedratico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatedraticoService {
    @Autowired
    CatedraticoRepository catedraticoRepository;

    public List<Catedratico> buscarTodo(){

        return (List<Catedratico>)this.catedraticoRepository.findAll();
    }
    public Catedratico registar(Catedratico catedratico){
        return this.catedraticoRepository.save(catedratico);
    }

}
