package br.venson.net.designpatterns.command.depois;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        Macro macro = new Macro();

        // O cliente monta os comandos com o receiver e os parametros, e entrega para a Macro
        macro.adicionar(new DigitarComando(editor, "Ola "));
        macro.adicionar(new DigitarComando(editor, "mundo"));
        macro.adicionar(new ApagarComando(editor, 3));
        macro.adicionar(new SubstituirComando(editor, "Ola", "Oi"));

        macro.executar();
        System.out.println("Depois de executar: \"" + editor.getTexto() + "\"");

        macro.desfazer();
        System.out.println("Depois de desfazer: \"" + editor.getTexto() + "\"");
    }
}
