package org.example.Ex09;

import java.util.LinkedList;
import java.util.Queue;

public class FilaMensagens {
    private Queue<String> mensagens = new LinkedList<>();

    public String visualizarProximaMensagem() {
        return mensagens.peek();
    }

    public String obterProximaMensagem() {
        return mensagens.poll();
    }

    public void adicionarMensagem(String mensagem) {
        mensagens.add(mensagem);
    }

    public static void main(String[] args) {
        FilaMensagens fila = new FilaMensagens();
        fila.adicionarMensagem("Olá");
        fila.adicionarMensagem("Aqui é o Alberto");
        fila.adicionarMensagem("Quem está ai?");

        System.out.println(fila.visualizarProximaMensagem());

        System.out.println(fila.obterProximaMensagem());
        System.out.println(fila.obterProximaMensagem());
    }
}
