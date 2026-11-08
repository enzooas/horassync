// CalculoPadraoStrategy.java
package br.com.pooalab.horassync.strategy;

import br.com.pooalab.horassync.model.Atividade;
import br.com.pooalab.horassync.model.CategoriaAtividade;
import java.util.List;

public class CalculoPadraoStrategy implements RegraCalculoStrategy {

	@Override
	public double calcularHorasAproveitadas(List<Atividade> atividades, CategoriaAtividade categoria) {
		double somaBruta = atividades.stream().filter(a -> a.getCategoria() == categoria)
				.mapToDouble(Atividade::getHorasDeclaradas).sum();

		return Math.min(somaBruta, categoria.getLimiteMaximoHoras());
	}
}
