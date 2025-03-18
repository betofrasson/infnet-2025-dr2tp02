package org.example.Ex04;

public class Produto {
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Produto aplicarDesconto(double valorDesconto) {
        return new Produto(this.nome, this.preco - valorDesconto);
    }
}
