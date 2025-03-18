package org.example.Ex03;

public class Pedido {

    private ICliente cliente;

    public Pedido(ICliente cliente) {
        this.cliente = (cliente != null) ? cliente : new ClienteNulo();
    }
    public String getNomeCliente() {
        return cliente.getNome();
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alberto");
        Pedido pedido = new Pedido(cliente);
        System.out.println(pedido.getNomeCliente());

        Pedido pedido2 = new Pedido(null);
        System.out.println(pedido2.getNomeCliente());
    }
}