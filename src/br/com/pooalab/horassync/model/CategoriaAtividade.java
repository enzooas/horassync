package br.com.pooalab.horassync.model;

public enum CategoriaAtividade {
	DISCIPLINAS_EXTRACURRICULARES("Disciplinas Extracurriculares", 120.0),
	PESQUISA("Atividades de Pesquisa / Iniciação Científica", 120.0),
	EXTENSAO("Atividades de Extensão e Cursos Livres", 120.0),
	INTERCAMBIO("Participação em Intercâmbio", 120.0),
	MONITORIA("Monitoria Acadêmica", 90.0),
	ESTAGIO_EXTRACURRICULAR("Estágio Extracurricular", 90.0),
	EVENTOS_ACADEMICOS("Eventos Acadêmico-Científicos", 60.0),
	APRESENTACAO_TRABALHO("Apresentação de Trabalho Científico", 60.0),
	PUBLICACAO_TRABALHOS("Publicações e Registros de Trabalhos", 60.0),
	VOLUNTARIADO("Atividades Sociais e Voluntariado", 60.0),
	EMPRESA_JUNIOR("Atividades Extracurriculares / Empresa Júnior", 60.0),
	CURSOS_ATUALIZACAO("Cursos de Atualização Profissional", 40.0),
	REPRESENTACAO_DISCENTE("Representação Discente nos Órgãos", 20.0),
	EVENTOS_ESTUDANTIS("Eventos de Órgãos Estudantis", 20.0),
	OUVINTE_BANCAS("Ouvinte em Bancas de TCC/Mestrado/Doutorado", 20.0);

	private final String descricao;
	private final double limiteMaximoHoras;

	CategoriaAtividade(String descricao, double limiteMaximoHoras) {
		this.descricao = descricao;
		this.limiteMaximoHoras = limiteMaximoHoras;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getLimiteMaximoHoras() {
		return limiteMaximoHoras;
	}
}
