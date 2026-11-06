package com.exemplo;

import java.nio.file.Files;
import java.nio.file.Path;

public class ThrowsDemo {

    public void executar()  {
        executarExecao();
    }

    private void executarExecao() {
        System.out.println("Tentando ler arquivo...");
        String conteudo = Files.readString(Path.of("arquivo-para-throws.txt"));
        System.out.println(conteudo);
    }
}
