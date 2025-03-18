package org.example.Ex05;

public class ClienteClassificador {
    private static ClassificacaoClienteService classificacaoClienteService = new ClassificacaoClienteService();

    public static String classificarCliente(int idade, double renda, int compras, String localizacao) {
        ClassificacaoCliente classificacao = classificacaoClienteService.classificar(idade, renda, compras);
        return classificacao.getDescricao();
    }

    public static void main(String[] args) {
        System.out.println(classificarCliente(25, 30000, 10, "Tubarão"));
        System.out.println(classificarCliente(80, 30000, 20, "Tubarão"));
        System.out.println(classificarCliente(25, 1850, 5, "Tubarão"));
    }
}
