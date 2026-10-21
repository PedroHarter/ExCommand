# Exercícios: Padrão Command

Exercícios do tópico 17 (Command) da disciplina de Design Patterns.

As respostas dos exercícios teóricos e a análise do exercício 2 estão em [RESPOSTAS.md](RESPOSTAS.md).

## Estrutura

```
src/main/java/br/venson/net/designpatterns/command/
├── antes/                      projeto original, a macro é uma lista de strings lida por um switch
│   ├── Main.java
│   ├── Editor.java
│   └── Macro.java
└── depois/                     refatoração usando o padrão Command
    ├── Main.java                   cliente, monta os comandos e entrega para a macro
    ├── Comando.java                interface com executar() e desfazer()
    ├── DigitarComando.java         comando concreto
    ├── ApagarComando.java          comando concreto
    ├── SubstituirComando.java      comando concreto novo, criado sem mexer na Macro
    ├── Editor.java                 receiver, faz o trabalho de verdade
    └── Macro.java                  invoker, só guarda e dispara os comandos
```

## Como rodar

Projeto Maven com Java 17.

- **VS Code / Eclipse / IntelliJ:** abra a pasta do projeto e execute a classe `Main` de cada pacote.
- **Linha de comando:**
  ```bash
  mvn compile
  java -cp target/classes br.venson.net.designpatterns.command.antes.Main
  java -cp target/classes br.venson.net.designpatterns.command.depois.Main
  ```

Os diagramas de classes do `RESPOSTAS.md` foram feitos em Mermaid. No GitHub eles aparecem direto; no VS Code é preciso a extensão *Markdown Preview Mermaid Support* para ver no preview.
