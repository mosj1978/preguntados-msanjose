package com.github.msanjose.api.questionados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.msanjose.api.questionados.entities.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	Categoria findByNombre(String nombre);

	boolean existsByNombre(String nombre);

	Categoria findById(int id);
}
