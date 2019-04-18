package edu.umg.antigua.cursos.service;

import edu.umg.antigua.cursos.dao.CatedraticoRepository;
import edu.umg.antigua.cursos.models.Catedratico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatedraticoService {
    @Autowired
    private CatedraticoRepository catedraticoRepository;
    public List<Catedratico> buscarTodos(){
        return (List<Catedratico>) this.catedraticoRepository.findAll();
    }
    public Catedratico registrar(Catedratico catedratico){
        return this.catedraticoRepository.save(catedratico);
    }
}
