package com.company;

import com.company.meli.Arquivo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
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



    }
//

}
