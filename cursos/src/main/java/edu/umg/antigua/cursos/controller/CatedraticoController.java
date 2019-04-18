package edu.umg.antigua.cursos.controller;

import edu.umg.antigua.cursos.models.Catedratico;
import edu.umg.antigua.cursos.service.CatedraticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catedraticos")
public class CatedraticoController {
    @Autowired
    private CatedraticoService catedraticoService;
    @GetMapping("/catedratico")
    public List<Catedratico> buscarTodos(){
        return this.catedraticoService.buscarTodos();
    }
    @PostMapping("/registrar")
    public Catedratico registrar(@RequestBody(required = true)Catedratico catedratico){
        return this.catedraticoService.registrar(catedratico);
    }
}
