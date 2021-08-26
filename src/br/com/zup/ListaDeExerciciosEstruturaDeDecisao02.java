package br.com.zup;

import java.util.Scanner;

public class ListaDeExerciciosEstruturaDeDecisao02 {
    public static void main(String[] args) {
        // 2 - Faça um programa que receba o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

        //inicie o Scanner
        Scanner leitorValores = new Scanner(System.in);

        //Defina as variáveis
        float produto1;
        float produto2;
        float produto3;

        //Usuario informando os dados
        System.out.println("Insira aqui o valor do produto 1");
        produto1 = leitorValores.nextFloat();
        System.out.println("Insira aqui o valor do produto 2");
        produto2 = leitorValores.nextFloat();
        System.out.println("Insira aqui o valor do produto 3");
        produto3 = leitorValores.nextFloat();




    }
}
