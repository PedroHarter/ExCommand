package br.venson.net.designpatterns.command.antes;

public class Editor {

    private final StringBuilder texto = new StringBuilder();

    public void digitar(String t) {
        texto.append(t);
    }

    public String apagar(int n) {
        int inicio = texto.length() - n;
        String removido = texto.substring(inicio);
        texto.delete(inicio, texto.length());
        return removido;
    }

    public String getTexto() {
        return texto.toString();
    }
}
