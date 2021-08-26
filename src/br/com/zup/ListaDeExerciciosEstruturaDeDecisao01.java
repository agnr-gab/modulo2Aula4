package br.com.zup;

import java.util.Scanner;

public class ListaDeExerciciosEstruturaDeDecisao01 {

    public static void main(String[] args) {
	// 1 - Faça um programa que receba dois números e imprima o maior deles.

        Scanner leitorNumeroMaior = new Scanner(System.in);
        float numero1;
        float numero2;

        System.out.println("Insira o primeiro número");
        numero1 = leitorNumeroMaior.nextFloat();
        System.out.println("Insira o segundo número");
        numero2 = leitorNumeroMaior.nextFloat();

        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é o maior número digitado");
        }
        else {
            System.out.println("O número " + numero2 + " é o maior número digitado");
        }


    }
}
