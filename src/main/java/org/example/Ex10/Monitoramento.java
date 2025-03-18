package org.example.Ex10;

public class Monitoramento {
    private int contadorAcessos = 0;

    public int setContadorAcessos() {
        return ++contadorAcessos;
    }

    public int getContadorAcessos() {
        return contadorAcessos;
    }

    public static void main(String[] args) {
        Monitoramento contador = new Monitoramento();
        contador.setContadorAcessos();
        contador.setContadorAcessos();
        System.out.println(contador.getContadorAcessos());
    }
}
