package com.company.meli;

import java.util.Random;

public class Calculos {


    public double Calculos() {
        //Indica qual é o mmaior e menor
        public static float nextAfter(float start, double direction) {
            return Math.nextAfter(start, direction);
        }
        //éxponencial
        public static double pow(double a, double b) {
            return StrictMath.pow(a, b); // default impl. delegates to StrictMath
        }
        //cosseno
        public static double cos() {
            return StrictMath.cos(a); // default impl. delegates to StrictMath
        }
        //raiz
        public static double raiz() {
            return StrictMath.sqrt(a);
        }
        //random
        public static double aleatorio() {
            Random random = new Random(999);
            return  random.nextDouble();
        }
        //

    }
}