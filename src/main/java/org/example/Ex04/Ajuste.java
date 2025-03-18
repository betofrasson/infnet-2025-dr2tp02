package org.example.Ex04;

public class Ajuste {
    public Produto aplicarDesconto(Produto produto, double valorDesconto) {
        return produto.aplicarDesconto(valorDesconto);
    }

    public static void main(String[] args) {
        Produto produtoComprado = new Produto("Celular", 3000);

        Ajuste ajuste = new Ajuste();
        Produto produtoComDesconto = ajuste.aplicarDesconto(produtoComprado, 500);
        System.out.println(produtoComDesconto.getNome() +" - Preço: " + produtoComDesconto.getPreco());

        Produto produtoComDesconto2 = ajuste.aplicarDesconto(produtoComprado, 1500);
        System.out.println(produtoComDesconto2.getNome() +" - Preço: " + produtoComDesconto2.getPreco());
    }
}
