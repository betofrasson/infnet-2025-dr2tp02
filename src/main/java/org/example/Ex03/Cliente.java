package org.example.Ex03;

public class Cliente implements ICliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
