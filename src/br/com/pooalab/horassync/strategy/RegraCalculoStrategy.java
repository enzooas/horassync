package br.com.pooalab.horassync.strategy;

import br.com.pooalab.horassync.model.Atividade;
import br.com.pooalab.horassync.model.CategoriaAtividade;
import java.util.List;

public interface RegraCalculoStrategy {
	double calcularHorasAproveitadas(List<Atividade> atividades, CategoriaAtividade categoria);
}
