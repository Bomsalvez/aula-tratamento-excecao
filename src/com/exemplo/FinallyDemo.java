package com.exemplo;

import java.io.FileWriter;

public class FinallyDemo {

    public void executar() {
        FileWriter arquivo = null;

        System.out.println("Iniciando operação...");

        arquivo = new FileWriter("resultado.txt");
        arquivo.write("Conteúdo gravado no arquivo.");

        System.out.println("Arquivo gravado com sucesso!");

    }
}
