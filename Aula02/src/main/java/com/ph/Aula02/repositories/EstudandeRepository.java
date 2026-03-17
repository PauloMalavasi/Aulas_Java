package com.ph.Aula02.repositories;

import com.ph.Aula02.models.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudandeRepository extends JpaRepository <EstudanteModel, Long> {


}
