package br.venson.net.designpatterns.command.antes;

import java.util.ArrayList;
import java.util.List;

public class Macro {

    private final Editor editor;
    private final List<String> acoes = new ArrayList<>();

    public Macro(Editor editor) {
        this.editor = editor;
    }

    public void adicionar(String acao) {
        acoes.add(acao);
    }

    // O invocador conhece cada operacao, sua sintaxe e chama o Editor diretamente.
    // Nao ha como desfazer: nada guarda o estado anterior de cada passo.
    public void executar() {
        for (String a : acoes) {
            String[] partes = a.split(":");
            switch (partes[0]) {
                case "DIGITAR" -> editor.digitar(partes[1]);
                case "APAGAR" -> editor.apagar(Integer.parseInt(partes[1]));
                default -> throw new IllegalArgumentException("Acao invalida: " + a);
            }
        }
    }
}
