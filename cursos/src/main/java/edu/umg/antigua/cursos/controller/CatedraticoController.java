package edu.umg.antigua.cursos.controller;

import edu.umg.antigua.cursos.models.Catedratico;
import edu.umg.antigua.cursos.service.CatedraticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Catedratico")
public class CatedraticoController {
    @Autowired
    private CatedraticoService catedraticoService;
    @GetMapping ("/buscarTodos")
    public List<Catedratico> buscarTodos(){
        return this.catedraticoService.buscarTodo();
    }
    @PostMapping("/crear")
    public Catedratico crear(@RequestBody(required = true) Catedratico newCatedratico){
        return this.catedraticoService.registar(newCatedratico);
    }
}
