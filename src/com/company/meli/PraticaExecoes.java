package com.company.meli;

public class PraticaExecoes {

    int a = 0,
            b = 300;

    public void PraticaExecao() {
        try {
            double vResult = this.b / this.a;
        } catch (IllegalArgumentException arithmeticException) {
            //System.out.println(arithmeticException.getMessage());
        } finally {
            System.out.println("Nao pode ser dividido por zero");

        }
    }
}
