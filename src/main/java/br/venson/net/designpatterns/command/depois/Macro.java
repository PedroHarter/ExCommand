package br.venson.net.designpatterns.command.depois;

import java.util.ArrayList;
import java.util.List;

// Invoker: so guarda os comandos e dispara, nao conhece o Editor nem as operacoes
public class Macro {

    private final List<Comando> comandos = new ArrayList<>();

    public void adicionar(Comando comando) {
        comandos.add(comando);
    }

    public void executar() {
        for (Comando comando : comandos) {
            comando.executar();
        }
    }

    // Desfaz de tras para frente, porque cada passo depende do texto deixado pelo anterior
    public void desfazer() {
        for (int i = comandos.size() - 1; i >= 0; i--) {
            comandos.get(i).desfazer();
        }
    }
}
