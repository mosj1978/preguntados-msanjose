package com.github.sanchezih.api.questionados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.sanchezih.api.questionados.entities.Pregunta;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Integer> {

	Pregunta findById(int id);

	Pregunta findByEnunciado(String enunciado);
}
