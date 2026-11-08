package br.com.pooalab.horassync.model;

import br.com.pooalab.horassync.annotation.ValidaCargaHoraria;
import java.time.LocalDate;

public class Atividade {
	private final String id;
	private final String titulo;
	private final CategoriaAtividade categoria;

	@ValidaCargaHoraria(min = 0.5, max = 150.0)
	private final double horasDeclaradas;

	private final LocalDate dataConclusao;

	public Atividade(String id, String titulo, CategoriaAtividade categoria, double horasDeclaradas,
			LocalDate dataConclusao) {
		if (horasDeclaradas <= 0) {
			throw new IllegalArgumentException("A carga horária deve ser maior que zero.");
		}
		this.id = id;
		this.titulo = titulo;
		this.categoria = categoria;
		this.horasDeclaradas = horasDeclaradas;
		this.dataConclusao = dataConclusao;
	}

	public String getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public CategoriaAtividade getCategoria() {
		return categoria;
	}

	public double getHorasDeclaradas() {
		return horasDeclaradas;
	}

	public LocalDate getDataConclusao() {
		return dataConclusao;
	}
}
