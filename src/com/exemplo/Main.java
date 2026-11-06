package com.exemplo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean executando = true;

            while (executando) {
                exibirMenu();

                System.out.print("Escolha uma opção: ");
                String entrada = scanner.nextLine();

                int codigo;
                try {
                    codigo = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("Digite um número válido.\n");
                    continue;
                }

                DemoOpcao opcao = DemoOpcao.porCodigo(codigo);

                if (opcao == null) {
                    System.out.println("Opção inexistente.\n");
                    continue;
                }

                // O switch trabalha com os valores do enum.
                switch (opcao) {
                    case SAIR -> {
                        executando = false;
                        System.out.println("Encerrando o laboratório.");
                    }
                    case USUARIO_NULO -> new UsuarioNuloDemo().executar();
                    case EXCECAO_VERIFICADA -> new ExcecaoVerificadaDemo().executar();
                    case FINALLY -> new FinallyDemo().executar();
                    case TRY_WITH_RESOURCES -> new TryWithResourcesDemo().executar();
                    case THROWS -> new ThrowsDemo().executar();
                    case THROW_SEM_CAPTURA -> new ThrowSemCapturaDemo().executar();
                    default -> System.out.println("Opção não implementada.");
                }

                if (executando) {
                    System.out.println("\nPressione ENTER para voltar ao menu...");
                    scanner.nextLine();
                }
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("==============================================");
        System.out.println("     LABORATÓRIO DE TRATAMENTO DE EXCEÇÕES");
        System.out.println("==============================================");

        for (DemoOpcao opcao : DemoOpcao.values()) {
            System.out.printf("%d - %s%n",
                    opcao.getCodigo(),
                    opcao.getDescricao());
        }

        System.out.println("==============================================");
    }
}
