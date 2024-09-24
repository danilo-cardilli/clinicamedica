package com.clinica.clinicamedica.controller;

import com.clinica.clinicamedica.medico.DadosCadastroMedico;
import com.clinica.clinicamedica.medico.Medico;
import com.clinica.clinicamedica.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {

        repository.save(new Medico(dados));
    }

}
