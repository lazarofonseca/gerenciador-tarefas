package com.lazaro.tarefas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lazaro.tarefas.enums.StatusTarefa;
import com.lazaro.tarefas.modelo.Tarefa;
import com.lazaro.tarefas.repository.TarefaRepository;

@Service
public class TarefaService {
	
	private final TarefaRepository repository;
	
	public TarefaService(TarefaRepository repository) {
		this.repository = repository;
	}
	
	public Tarefa criar(Tarefa tarefa) {
		tarefa.setStatus(StatusTarefa.PENDENTE);
		return repository.save(tarefa);
	}
	
	public List<Tarefa> listar() {
		return repository.findAll();
	}
	
	public Tarefa concluir(Long id) {
		Tarefa tarefa = repository.findById(id).orElseThrow();
		tarefa.setStatus(StatusTarefa.CONCLUIDA);
		return repository.save(tarefa);
	}

}
