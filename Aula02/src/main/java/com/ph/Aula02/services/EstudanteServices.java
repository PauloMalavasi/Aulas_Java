package com.ph.Aula02.services;

import com.ph.Aula02.models.EstudanteModel;
import com.ph.Aula02.repositories.EstudandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteServices {

    @Autowired
    private EstudandeRepository estudandeRepository;

    public List<EstudanteModel> findAll(){
        return  estudandeRepository.findAll();
    }

    public EstudanteModel createEstudante(EstudanteModel estudanteModel){
        return estudandeRepository.save(estudanteModel);
    }

    public void deleteEstudante(Long id){
        estudandeRepository.deleteById(id);
    }


}
