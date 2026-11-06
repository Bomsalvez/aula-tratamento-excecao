package com.exemplo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesDemo {

    public void executar() {
        BufferedWriter writer = new BufferedWriter(new FileWriter("exemplo.txt"));
        writer.write("Estudando tratamento de exceções em Java.");
        writer.newLine();
        writer.write("Aprendendo try-with-resources.");
    }
}
