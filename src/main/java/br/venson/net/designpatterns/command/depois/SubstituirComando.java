package br.venson.net.designpatterns.command.depois;

// Acao nova: so foi preciso criar esta classe, a Macro continua igual
public class SubstituirComando implements Comando {

    private final Editor editor;
    private final String alvo;
    private final String novo;
    // Guarda onde a troca aconteceu para conseguir voltar no desfazer
    private int posicao = -1;

    public SubstituirComando(Editor editor, String alvo, String novo) {
        this.editor = editor;
        this.alvo = alvo;
        this.novo = novo;
    }

    @Override
    public void executar() {
        posicao = editor.getTexto().indexOf(alvo);
        if (posicao >= 0) {
            editor.substituir(posicao, alvo, novo);
        }
    }

    @Override
    public void desfazer() {
        if (posicao >= 0) {
            editor.substituir(posicao, novo, alvo);
        }
    }
}
