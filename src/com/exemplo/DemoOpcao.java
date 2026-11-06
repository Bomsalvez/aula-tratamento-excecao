package com.exemplo;

public enum DemoOpcao {
    SAIR(0, "Sair"),
    USUARIO_NULO(1, "NullPointerException — acessar atributo nulo"),
    EXCECAO_VERIFICADA(2, "Checked Exception — leitura de arquivo"),
    FINALLY(3, "try-catch-finally"),
    TRY_WITH_RESOURCES(4, "try-with-resources"),
    THROWS(5, "throws — propagação de exceção"),
    THROW_SEM_CAPTURA(6, "throw sem captura");

    private final int codigo;
    private final String descricao;

    DemoOpcao(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }


    public static DemoOpcao porCodigo(int codigo) {
        for (DemoOpcao opcao : values()) {
            if (opcao.codigo == codigo) {
                return opcao;
            }
        }

        return null;
    }
}
