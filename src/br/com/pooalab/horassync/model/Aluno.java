package br.com.pooalab.horassync.model;

public class Aluno {
	private final String matricula;
	private final String nome;
	private final String curso;

	public Aluno(String matricula, String nome, String curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getCurso() {
		return curso;
	}
}
