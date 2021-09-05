/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author JuanB
 */
public class Main {

    public static double factorial(int numero) {
        double factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static double errorAprox(double aproxActual, double aproxAnterior) {
        double errorAprox;
        errorAprox = Math.abs((aproxActual - aproxAnterior) / aproxActual) * 100;
        return errorAprox;
    }

    public static void main(String[] args) {
        System.out.println("Taller MC Juan_Rojas");
        double resultado = 0;
        double errorAproximado, errorEsperado;
        double exponente = -1.75;

        // Se define el error esperado para 7 cifras signficativa:
        errorEsperado = (0.5 * Math.pow(10, -7) * 100);
        errorAproximado = 10000;
        int numeroIteraciones = 0;
        double resultadoAnterior = 1;
        while (errorAproximado > errorEsperado) {
            numeroIteraciones = numeroIteraciones + 1;
            resultadoAnterior = resultado;
            if (numeroIteraciones % 2 == 0) {
                //aqui se pone la operacion positiva
                resultado = resultado + ((Math.pow(exponente, numeroIteraciones) / factorial(numeroIteraciones)));
            } else {
                //aqui se pone la operacion negativa
                resultado = resultado - ((Math.pow(exponente, numeroIteraciones) / factorial(numeroIteraciones)));
            }
            

            errorAproximado = errorAprox(resultado,resultadoAnterior);
            System.out.println(numeroIteraciones +". Valor: " + resultado + " - Error: " + errorAproximado);
        }
        System.out.println("Valor: " + resultado);
    }
}
