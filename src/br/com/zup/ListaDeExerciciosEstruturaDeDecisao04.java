package br.com.zup;

import java.util.Scanner;

public class ListaDeExerciciosEstruturaDeDecisao04 {
    public static void main(String[] args) {
        // 4 - Os gestores da Zup resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calcula os reajustes. Portanto, faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
        //Salários até R$ 280,00 (incluindo), receberão aumento de 20%
        //Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
        //Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
        //Salários de R$ 1500,00 em diante, receberão aumento de 5%
        //Após o aumento ser realizado, informe na tela:
        //O salário antes do reajuste;
        //O percentual de aumento aplicado;
        //O valor do aumento;
        //O novo salário, após o aumento;

        // Scanner iniciado
        Scanner leitorSalario = new Scanner(System.in);

        //Inserção de dados do usuario
        double salarioZup = leitorSalario.nextDouble();
        int 20;
        int 15;
        int 10;
        int 5;

        //Calculo dos aumentos
        double aumento20 = salarioZup * 0.20;
        double aumento15 = salarioZup * 0.15;
        double aumento10 = salarioZup * 0.10;
        double aumento5 = salarioZup * 0.05;

        //O salário antes do reajuste;
        System.out.println("Seu salário atual sem o reajuste corresponde a R$" +salarioZup+ " reais");






    }
}
