package com.exemplo;

public class ThrowSemCapturaDemo {

    public void executar() {
       executarExcecao();
    }

    private void executarExcecao() {
        System.out.println("Validando operação...");
        throw new IllegalArgumentException("Operação não permitida!");
    }
}
