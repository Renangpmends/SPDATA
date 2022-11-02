package com.spdata.paciente.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spdata.paciente.entities.Paciente;
import com.spdata.paciente.services.PacienteService;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteController {

	@Autowired
	private PacienteService service;
	
	@GetMapping("/")
	public List<Paciente> findAll(){
		List<Paciente> result = service.listAll();
		return result;
	};  
	
	@GetMapping("{id}")
	public Paciente findById(@PathVariable(name = "id") Long id){
		return service.selecionar(id);
	}; 
	
	@PostMapping
	public void salvar(@RequestBody Paciente paciente){
		service.save(paciente);
	};  
	
	@DeleteMapping("{id}")
	public void deletePaciente(@PathVariable(name = "id") Long id){
		service.deletar(id);
	};  
	
}
