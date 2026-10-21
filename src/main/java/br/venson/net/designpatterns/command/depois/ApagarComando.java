package br.venson.net.designpatterns.command.depois;

public class ApagarComando implements Comando {

    private final Editor editor;
    private final int quantidade;
    // Guarda o que foi removido para conseguir devolver no desfazer
    private String apagado;

    public ApagarComando(Editor editor, int quantidade) {
        this.editor = editor;
        this.quantidade = quantidade;
    }

    @Override
    public void executar() {
        apagado = editor.apagar(quantidade);
    }

    @Override
    public void desfazer() {
        editor.digitar(apagado);
    }
}
