package org.example.Ex01;

public class Calculadora {
    public static int dobroDaSoma(int n1, int n2) {
        int resultadoSoma = n1 + n2;
        return resultadoSoma * 2;
    }

    public static void main(String[] args) {
        System.out.println(dobroDaSoma(2, 3));
    }
}
