package org.example.Ex03;

public class ClienteNulo implements ICliente {
    @Override
    public String getNome() {
        return "Cliente não cadastrado";
    }
}
