package com.github.msanjose.api.questionados.models.request;

import java.util.List;

import com.github.msanjose.api.questionados.entities.Respuesta;

public class InfoPreguntaNueva {
	public String enunciado;
	public List<Respuesta> opciones;
	public Integer categoriaId;
}
