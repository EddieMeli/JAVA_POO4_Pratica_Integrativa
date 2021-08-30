package com.company.meli;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.BufferOverflowException;

public class Arquivo {

    public void lerArquivo(String nomeArquivo) throws IOException {

        String texto = null;

        try { // Bloqo de leitura de arquivo
            BufferedReader bufferedReader = new BufferedReader((new FileReader(nomeArquivo)));

            try {
                while ((texto = bufferedReader.readLine()) != null) {
                    System.out.println(texto);
                }
                bufferedReader.close();
            }catch (IOException ioException){

            }
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("Erro ao ler o arquivo especificado");
        }
    }
}
