package com.company.meli;

import java.util.Random;

public class Calculos {

    public double a = 0.00;
    public double b = 0.00;

        //Indica qual é o maior e menor
        public static void maior(double a, double b) {
            if (a>b){
                System.out.println("a maior que b");
                System.out.println(a + " > " + b);
            }else if (b>a){
                System.out.println("a < b");
                System.out.println(a + " < " + b);
            }
        }
    public static void menor(double a, double b) {
        if (a<b){
            System.out.println("a menor que b");
            System.out.println(a + " < " + b);
        }else if (a>b){
            System.out.println("b menor que a");
            System.out.println(a + " > " + b);
        }
    }
        //exponencial
        public static double pow(double a, double b) {
            return StrictMath.pow(a, b); // default impl. delegates to StrictMath
        }
        //cosseno
        public static double cos(double a) {
            return StrictMath.cos(a); // default impl. delegates to StrictMath
        }
        //raiz
        public static double raiz(double a) {
            return StrictMath.sqrt(a);
        }
        //random
        public static double aleatorio() {
            Random random = new Random();
            double dblrandom =   random.nextDouble();

            do{

                dblrandom =   random.nextDouble() * 999;
            } while (dblrandom < 0 && dblrandom > 999);

            return dblrandom;
        }
        //

    }

