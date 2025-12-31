package com.lazaro.tarefas.service;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.lazaro.tarefas.enums.StatusTarefa;
import com.lazaro.tarefas.repository.TarefaRepository;

@Component
public class LembreteScheduler {
	
	private final TarefaRepository repository;
	
	public LembreteScheduler(TarefaRepository repository) {
		this.repository = repository;
	}
	
	
	@Scheduled(fixedRate = 60000)
	public void verificarLembretes() {
		var agora = LocalDateTime.now();
		
		var tarefas = repository.findByDataLembreteBeforeAndStatus(agora, StatusTarefa.PENDENTE);
		
		tarefas.forEach(t -> 
			System.out.println("LEMBRETE: " + t.getTitulo())
		);
	}

}
