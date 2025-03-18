package org.example.EX08;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean podeComprar(double valor) {
        return (saldo >= valor);
    }

    public boolean realizarCompra(double valor) {
        if (podeComprar(valor)) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(500);
        System.out.println("Conseguiu comprar? " + conta.realizarCompra(3000));

    }
}
