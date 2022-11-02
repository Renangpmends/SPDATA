package com.spdata.paciente.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "atendimento", schema = "spdata")
public class Atendimento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "idPaciente")
	private Paciente paciente;
	
	private Long idSituacao;
	private Date dataHoraAtend;
	private String diaginostico;
	private Date dataHoraEncer;
	private Date duracao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Long getIdSituacao() {
		return idSituacao;
	}
	public void setIdSituacao(Long idSituacao) {
		this.idSituacao = idSituacao;
	}
	public Date getDataHoraAtend() {
		return dataHoraAtend;
	}
	public void setDataHoraAtend(Date dataHoraAtend) {
		this.dataHoraAtend = dataHoraAtend;
	}
	public String getDiaginostico() {
		return diaginostico;
	}
	public void setDiaginostico(String diaginostico) {
		this.diaginostico = diaginostico;
	}
	public Date getDataHoraEncer() {
		return dataHoraEncer;
	}
	public void setDataHoraEncer(Date dataHoraEncer) {
		this.dataHoraEncer = dataHoraEncer;
	}
	public Date getDuracao() {
		return duracao;
	}
	public void setDuracao(Date duracao) {
		this.duracao = duracao;
	}
}