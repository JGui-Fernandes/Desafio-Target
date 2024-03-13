package org.example;

import java.util.Scanner;

public class Questao_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;

        System.out.println("Digite um número:");
        numero = scanner.nextInt();

        if(confereNumero(numero)){
            System.out.println("Este número está na sequência de Fibonacci!");
        } else{
            System.out.println("Este número não está na sequência de Fibonacci!");
        }


    }
    static long fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static boolean confereNumero(int n){
        long numeroFibonacci = 0;
        int contador = 0;

        while(numeroFibonacci <= n){
            numeroFibonacci = fibonacci(contador);
            if(numeroFibonacci == n){
                return true;
            }
            contador++;
        }
        return false;
    }
}
