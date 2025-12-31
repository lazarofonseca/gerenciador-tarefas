package com.lazaro.tarefas.modelo;

import java.time.LocalDateTime;

import com.lazaro.tarefas.enums.StatusTarefa;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	private String titulo;
	private String descricao;

	
	private LocalDateTime dataInicio;
	
	private LocalDateTime dataFim;
	private LocalDateTime dataLembrete;

	@Enumerated(EnumType.STRING)
	private StatusTarefa status;

	public Tarefa() {

	}

	public Tarefa(Long id, String titulo, String descricao, LocalDateTime dataInicio, LocalDateTime dataFim,
			LocalDateTime dataLembrete, StatusTarefa status) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.dataLembrete = dataLembrete;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}

	public LocalDateTime getDataLembrete() {
		return dataLembrete;
	}

	public void setDataLembrete(LocalDateTime dataLembrete) {
		this.dataLembrete = dataLembrete;
	}

	public StatusTarefa getStatus() {
		return status;
	}

	public void setStatus(StatusTarefa status) {
		this.status = status;
	}

}
