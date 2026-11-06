# Laboratório de Tratamento de Exceções em Java

Projeto didático com exemplos separados em classes. A classe `Main` apresenta um menu interativo que utiliza `enum` e `switch` para selecionar cada demonstração.

Os blocos `try-catch` ficam na classe principal, e não nas classes específicas. A exceção é `try-with-resources`, que contém o `try` necessário para gerenciar automaticamente o recurso, sem `catch`.

## Requisitos

- JDK 11 ou superior.

## Estrutura

```text
src/com/exemplo/
├── Main.java
├── DemoOpcao.java
├── UsuarioNuloDemo.java
├── ExcecaoVerificadaDemo.java
├── FinallyDemo.java
├── TryWithResourcesDemo.java
├── ThrowsDemo.java
└── ThrowSemCapturaDemo.java
```

## Compilar

Na pasta do projeto:

```bash
javac -d out src/com/exemplo/*.java
```

## Executar

```bash
java -cp out com.exemplo.Main
```

## Menu

1. NullPointerException — acessar atributo nulo.
2. Checked Exception — tentar ler arquivo inexistente.
3. try-catch-finally — observar a execução do `finally`.
4. try-with-resources — criar e escrever em arquivo com fechamento automático.
5. throws — propagar uma IOException até a classe principal.
6. throw sem captura — lançar uma IllegalArgumentException sem tratá-la.
0. Sair.

## Atenção à opção 6

A opção 6 lança intencionalmente uma exceção sem captura. Portanto, a aplicação termina e o menu não volta a ser exibido. Isso faz parte da demonstração de uma exceção não tratada.

O `Main` usa `try-with-resources` para fechar o `Scanner` ao encerrar a aplicação.
