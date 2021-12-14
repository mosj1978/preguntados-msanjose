package com.github.sanchezih.api.questionados.models.request;

import java.util.List;

import com.github.sanchezih.api.questionados.entities.Respuesta;

public class InfoPreguntaNueva {
	public String enunciado;
	public List<Respuesta> opciones;
	public Integer categoriaId;
}
