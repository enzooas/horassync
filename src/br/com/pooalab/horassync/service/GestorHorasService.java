package br.com.pooalab.horassync.service;

import br.com.pooalab.horassync.model.CategoriaAtividade;

public class GestorHorasService {

    public void adicionarAtividade(String nome, CategoriaAtividade categoria, int cargaHoraria) {
        // Implementação temporária para testes da UI
        System.out.println("LOG [Service]: Atividade '" + nome + "' recebida com sucesso!");
    }

    public void exibirRelatorio() {
        // Implementação temporária para testes da UI
        System.out.println("\n--- RELATÓRIO SIMULADO ---");
        System.out.println("Total de horas acumuladas: 50h / 200h");
        System.out.println("Status: Pendente (Faltam 150h)");
    }

    public void carregarDadosIniciais() {
        // Implementação temporária para testes da UI
        System.out.println("LOG [Service]: Dados de demonstração carregados na memória.");
    }
}
