package br.venson.net.designpatterns.command.antes;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        Macro macro = new Macro(editor);

        macro.adicionar("DIGITAR:Ola ");
        macro.adicionar("DIGITAR:mundo");
        macro.adicionar("APAGAR:3");

        macro.executar();
        System.out.println("Texto: \"" + editor.getTexto() + "\"");

        // Tente responder: como desfazer a macro passo a passo?
        // O que muda na Macro ao adicionar uma acao "SUBSTITUIR"?
        // Por que as acoes em String sao frageis (tipo, validacao, parametros)?
    }
}
