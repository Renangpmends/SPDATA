package com.spdata.paciente.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spdata.paciente.entities.Gestante;
import com.spdata.paciente.entities.Paciente;
import com.spdata.paciente.entities.TipoSexo;
import com.spdata.paciente.exception.RegraNegocioException;
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
	public ResponseEntity salvar(@RequestBody Paciente paciente){
		if(paciente.getSexo() == TipoSexo.MASCULINO && paciente.getGestante() != Gestante.NAO){
			return ResponseEntity.badRequest().body("Não é possivel selecionar a opção gestante sendo homem!");
		}
		try {
			paciente = service.save(paciente);
			return new ResponseEntity(paciente, HttpStatus.CREATED);
		} catch(RegraNegocioException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	};  
	
	@DeleteMapping("{id}")
	public void deletePaciente(@PathVariable(name = "id") Long id){
		service.deletar(id);
	};  
	
}
