package com.lazaro.tarefas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lazaro.tarefas.enums.StatusTarefa;
import com.lazaro.tarefas.modelo.Tarefa;
import java.time.LocalDateTime;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

	List<Tarefa> findByDataLembreteBeforeAndStatus(

			LocalDateTime agora, 
			StatusTarefa status
			
			);

}
