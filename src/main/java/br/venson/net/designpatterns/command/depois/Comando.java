package br.venson.net.designpatterns.command.depois;

// Command: todo pedido vira um objeto que sabe se executar e se desfazer
public interface Comando {

    void executar();

    void desfazer();
}
