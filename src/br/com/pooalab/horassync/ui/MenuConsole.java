package br.com.pooalab.horassync.ui;

import br.com.pooalab.horassync.model.CategoriaAtividade;
import br.com.pooalab.horassync.service.GestorHorasService;

public class MenuConsole {
    private final GestorHorasService gestorService;

    public MenuConsole(GestorHorasService gestorService) {
        this.gestorService = gestorService;
    }

    public void iniciar() {
        boolean executando = true;

        while (executando) {
            exibirMenu();
            int opcao = ConsoleUtils.lerInteiroPositivo("Escolha uma opção");

            System.out.println("\n" + "=".repeat(45));
            switch (opcao) {
                case 1 -> cadastrarAtividade();
                case 2 -> exibirRelatorio();
                case 3 -> carregarDadosDemonstracao();
                case 4 -> {
                    System.out.println("Encerrando o HorasSync. Bons estudos!");
                    executando = false;
                }
                default -> System.out.println("⚠️ Opção inválida. Escolha entre 1 e 4.");
            }
            System.out.println("=".repeat(45) + "\n");
        }
    }

    private void exibirMenu() {
        System.out.println("🎓 HORASSYNC - GESTOR DE HORAS COMPLEMENTARES");
        System.out.println("1. Cadastrar nova atividade");
        System.out.println("2. Exibir relatório de progresso");
        System.out.println("3. Carregar dados de demonstração (Pitch)");
        System.out.println("4. Sair");
    }

    private void cadastrarAtividade() {
        System.out.println("--- CADASTRO DE ATIVIDADE ---");
        String nome = ConsoleUtils.lerTexto("Nome do Curso/Evento");

        System.out.println("Categorias disponíveis:");
        CategoriaAtividade[] categorias = CategoriaAtividade.values();
        for (int i = 0; i < categorias.length; i++) {
            System.out.printf("%d. %s\n", i + 1, categorias[i]);
        }

        int catOpcao = ConsoleUtils.lerInteiroPositivo("Selecione a categoria");
        if (catOpcao < 1 || catOpcao > categorias.length) {
            System.out.println("⚠️ Categoria inválida! Operação cancelada.");
            return;
        }

        CategoriaAtividade categoria = categorias[catOpcao - 1];
        int cargaHoraria = ConsoleUtils.lerInteiroPositivo("Carga horária (horas)");

        try {
            // Chamando o método do serviço criado pela equipe
            gestorService.adicionarAtividade(nome, categoria, cargaHoraria);
            System.out.println("✅ Atividade cadastrada com sucesso!");
        } catch (Exception e) {
            System.out.println("⚠️ Erro ao cadastrar: " + e.getMessage());
        }
    }

    private void exibirRelatorio() {
        System.out.println("--- RELATÓRIO DE PROGRESSO ---");
        try {
            gestorService.exibirRelatorio();
        } catch (Exception e) {
            System.out.println("⚠️ Erro ao gerar relatório: " + e.getMessage());
        }
    }

    private void carregarDadosDemonstracao() {
        try {
            gestorService.carregarDadosIniciais();
            System.out.println("⚡ Dados de demonstração carregados com sucesso para o Pitch!");
        } catch (Exception e) {
            System.out.println("⚠️ " + e.getMessage());
        }
    }
}