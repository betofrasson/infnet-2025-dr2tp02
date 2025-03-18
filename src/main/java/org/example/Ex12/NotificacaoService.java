package org.example.Ex12;

public class NotificacaoService {
    public void enviarNotificacao(TipoNotificacao tipo) {
        switch (tipo) {
            case EMAIL:
                System.out.println("Enviando e-mail...");
                break;
            case SMS:
                System.out.println("Enviando SMS...");
                break;
            case PUSH:
                System.out.println("Enviando notificação push...");
                break;
        }
    }

    public static void main(String[] args) {
        NotificacaoService notificacaoService = new NotificacaoService();
        notificacaoService.enviarNotificacao(TipoNotificacao.SMS);
    }
}
