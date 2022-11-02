package com.spdata.paciente.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paciente", schema = "spdata")
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private TipoSexo sexo;
	private Gestante gestante;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public TipoSexo getSexo() {
		return sexo;
	}
	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}
	public Gestante getGestante() {
		return gestante;
	}
	public void setGestante(Gestante gestante) {
		this.gestante = gestante;
	}
}
