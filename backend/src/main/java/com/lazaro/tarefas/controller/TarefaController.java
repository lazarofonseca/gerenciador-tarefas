package com.lazaro.tarefas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lazaro.tarefas.modelo.Tarefa;
import com.lazaro.tarefas.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
	
	private final TarefaService service;
	
	public TarefaController(TarefaService service) {
		this.service = service;
	}
	
	@PostMapping
	public Tarefa criar(@RequestBody Tarefa tarefa) {
		return service.criar(tarefa);
	}
	
	@GetMapping
	public List<Tarefa> listar() {
		return service.listar();
	}
	
	@PutMapping("/{id}/concluir")
	public Tarefa concluir(@PathVariable Long id) {
		return service.concluir(id);
	}

}
