package org.example;

import java.util.Scanner;

public class Questao_5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String texto;
        System.out.println("Escreva seu texto:");
        texto = scanner.nextLine();

        System.out.println(inverteTexto(texto));
    }

    static String inverteTexto(String t){
        String texto = "";

        for(int i = t.length() - 1; i >= 0; i--){
            texto += t.charAt(i);
        }

        return texto;
    }
}
