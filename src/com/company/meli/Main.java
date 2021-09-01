package com.company.meli;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// Exercicio 1
        PraticaExecoes praticaExecoes = new PraticaExecoes();

        try {
            praticaExecoes.PraticaExecao();
        } catch (Exception e){

        }

        System.out.println("Programa Finalizado");

        // Exercicio 2
        String mensagemFinal = "Esta e a ultima mensagem";

        int[] numeros = new int[5];
        try {

            numeros[5] = 10; //Index 5 out of bounds for length 5
        } catch (Exception ex){
            System.out.println("Erro na Execucao " + ex.getMessage());
        }

        // Exercicio 3
        Arquivo arquivo = new Arquivo();

        arquivo.lerArquivo("");

        // Exercicio 4
        Double a = 5d;
        Double b = 2d;

        System.out.println("Calculos.maior(a,b);");
        Calculos.maior(a,b);
        System.out.println("Calculos.menor(a,b);");
        Calculos.menor(a,b);
        System.out.println("Calculos.pow(a,b);");
        System.out.println(Calculos.pow(a,b));
        System.out.println("Calculos.pow(b,a);");
        System.out.println(Calculos.pow(b,a));
        System.out.println("Calculos.cos(a);");
        System.out.println(Calculos.cos(a));
        System.out.println("Calculos.cos(b);");
        System.out.println(Calculos.cos(b));
        System.out.println("Calculos.raiz(a);");
        System.out.println(Calculos.raiz(a));
        System.out.println("Calculos.raiz(b);");
        System.out.println(Calculos.raiz(b));
        System.out.println("Calculos.aleatorio();");
        System.out.println(Calculos.aleatorio());



    }
//

}
