package com.github.msanjose.api.questionados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.msanjose.api.questionados.entities.Respuesta;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Integer> {

}
