package br.venson.net.designpatterns.command.depois;

public class DigitarComando implements Comando {

    private final Editor editor;
    private final String texto;

    public DigitarComando(Editor editor, String texto) {
        this.editor = editor;
        this.texto = texto;
    }

    @Override
    public void executar() {
        editor.digitar(texto);
    }

    // Para desfazer basta apagar a mesma quantidade de caracteres que foi digitada
    @Override
    public void desfazer() {
        editor.apagar(texto.length());
    }
}
