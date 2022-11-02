package com.spdata.paciente.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.spdata.paciente.entities.Paciente;
import com.spdata.paciente.repositories.PacienteRepository;

public class PacienteService {

	@Autowired
	private PacienteRepository repository;
	
	public List<Paciente> listAll(){
		return repository.findAll();
	}
	
	public void save(Paciente paciente) {
		repository.save(paciente);
	}
	
	public Paciente selecionar(long id) {
		return repository.findById(id).get();
	}
	
	public void deletar(long id) {
		repository.deleteById(id);
	}
}
