package br.com.zup;

import java.util.Scanner;

public class ListaDeExerciciosEstruturaDeDecisao03 {
    public static void main(String[] args) {
    // 3 - Faça um programa que receba duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
        //A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        //A mensagem "Reprovado", se a média for menor do que sete;
        //A mensagem "Aprovado com Distinção", se a média for igual a dez.

        //Iniciando o Scanner
        Scanner leitorNotas = new Scanner(System.in);

        //Solicitando dados ao usuario
        System.out.println("Digite a sua primeira nota");
        double nota1 = leitorNotas.nextDouble();
        System.out.println("Digite a sua segunda nota");
        double nota2 = leitorNotas.nextDouble();

        double mediaParcial = (nota1 + nota2) / 2;

        //A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        if(mediaParcial >=7 & mediaParcial >=9) {
            System.out.println("A sua média "+mediaParcial+ " alcançou a nota mínima necessária. Você foi aprovade");
        }
        //A mensagem "Reprovado", se a média for menor do que sete;
        else if (mediaParcial < 7) {
            System.out.println("A sua média "+mediaParcial+ " não alcançou a nota mínima necessária. Você foi reprovade");
        }
        //A mensagem "Aprovado com Distinção", se a média for igual a dez.
        else if (mediaParcial = 10) {
            System.out.println("Você acalnçou nota máxima "+mediaParcial+ "!" + "Você está aprovade com louvor!");
        } else (mediaParcial =< 0.0 || mediaParcial => 10.1) {
        System.out.println("O número digitado não corresponde a valor das médias. Digite um valor válido");
    }


    }
}
