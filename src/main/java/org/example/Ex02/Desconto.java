package org.example.Ex02;

public class Desconto {
    public static double calcularDesconto(double preco) {
        double percentualDesconto = 10;

        if (preco >= 1000) {
            double valorAtualizado = preco - (preco * (percentualDesconto / 100));
            return valorAtualizado;
        }
        return preco;
    }

    public static void main(String[] args) {
        System.out.println("Preco: 500 / Com desconto: " + calcularDesconto(500.0));
        System.out.println("Preco: 1000 / Com desconto: " + calcularDesconto(1000.0));
        System.out.println("Preco: 2500 / Com desconto: " + calcularDesconto(2500.0));
    }
}