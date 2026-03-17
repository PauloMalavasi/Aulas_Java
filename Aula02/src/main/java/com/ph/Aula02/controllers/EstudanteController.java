package com.ph.Aula02.controllers;

import com.ph.Aula02.models.EstudanteModel;
import com.ph.Aula02.services.EstudanteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudantes")

public class
EstudanteController {

    @Autowired
    private EstudanteServices estudanteServices;

    @GetMapping
    public List<EstudanteModel> findAll(){
        return estudanteServices.findAll();
    }

    @PostMapping
    public EstudanteModel criaEstudanteModel(@RequestBody EstudanteModel estudanteModel){
        return  estudanteServices.createEstudante(estudanteModel);
    }
    @DeleteMapping("/{id}")
    public void deleteEstudante(@PathVariable Long id){
        estudanteServices.deleteEstudante(id);
    }
}
