package com.spdata.paciente.controllers;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spdata.paciente.entities.Paciente;
import com.spdata.paciente.repositories.PacienteRepository;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteController {

	@Autowired
	private PacienteRepository repository;
	
	@GetMapping
	public List<Paciente> findAll(){
		List<Paciente> result = repository.findAll();
		return result;
	};  
}
