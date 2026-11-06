package com.exemplo;

public class UsuarioNuloDemo {

    static class Usuario {
        String nome;
    }

    public void executar() {
        Usuario usuario = new Usuario();
        // O atributo nome não foi inicializado.
        System.out.println(usuario.nome.toUpperCase());
    }
}
