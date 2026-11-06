package com.exemplo;

import java.io.File;

public class ExcecaoVerificadaDemo {

    public void executar() {
        File arquivo = new File("arquivo.txt");

        if (arquivo.createNewFile()) {
            System.out.println("Arquivo criado com sucesso!");
        } else {
            System.out.println("O arquivo já existe.");
        }
    }
}
