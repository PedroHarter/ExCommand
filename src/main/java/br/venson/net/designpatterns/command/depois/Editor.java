package br.venson.net.designpatterns.command.depois;

// Receiver: quem faz o trabalho de verdade, nao sabe nada de comandos nem de macros
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

    // Operacao nova, usada pelo SubstituirComando
    public void substituir(int posicao, String atual, String novo) {
        texto.replace(posicao, posicao + atual.length(), novo);
    }

    public String getTexto() {
        return texto.toString();
    }
}
