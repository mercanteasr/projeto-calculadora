package ProjetoSimplesCalculadora;

import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.cbrt;


public class calculadoraSimples {
    public static void main(String[] args){

        estatistica();

        Scanner leitorOpcao = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n-----MENU PRINCIPAL-----\n");
            System.out.println("[1] Operações Basicas (+ -  x  ÷ )/");
            System.out.println("[2] Potencias e raizes/");
            System.out.println("[3] Estatística (media, media, desvio...)/");
            opcao = leitorOpcao.nextInt();


            switch (opcao) {
                case 1:
                    operacoesBasicas();
                    break;
                case 2:
                    potenciasRaizes();
                    break;
                case 3:
                    estatistica();
                    break;
            }

        }while(opcao != 4);
    }

    public static void operacoesBasicas(){

        Scanner leitorNumero = new Scanner(System.in);
        int opcaoOperacoes = 0;

        double numero1 = 0;
        double numero2 = 0;

        double soma = 0;
        double divisao = 0;
        double subtracao = 0;
        double multiplicacao = 0;

        do {
            System.out.println("\n\nCalculadora simples em Java");
            System.out.println("----------MENU----------\n");
            System.out.println("[1] Calculo da Soma/");
            System.out.println("[2] Calculo da Subtração/");
            System.out.println("[3] Calculo da Multiplicação/");
            System.out.println("[4] Calculo da Divisão/");
            System.out.println("[5] Voltar ao menu principal/");


            System.out.println("| Digite um numero para escolha |\n");
            opcaoOperacoes = leitorNumero.nextInt();

            switch (opcaoOperacoes) {
                case 1:
                    System.out.println("| Calculo de soma |\n");
                    numero1 = leitorNumero.nextDouble();
                    System.out.println("+");
                    numero2 = leitorNumero.nextDouble();

                    soma = numero1 + numero2;
                    System.out.format("A soma entre %.0f e %.0f = %.0f", numero1, numero2, soma);
                    break;

                case 2:
                    System.out.println("| Calculo de Subtração |\n");
                    numero1 = leitorNumero.nextDouble();
                    System.out.println("-");
                    numero2 = leitorNumero.nextDouble();

                    subtracao = numero1 - numero2;
                    System.out.format("A subtração entre %.0f e %.0f = %.0f", numero1, numero2, subtracao);
                    break;

                case 3:
                    System.out.println("| Calculo de Multiplicação |\n");
                    numero1 = leitorNumero.nextDouble();
                    System.out.println(".");
                    numero2 = leitorNumero.nextDouble();

                    multiplicacao = numero1 * numero2;
                    System.out.format("A multiplicação entre %.0f e %.0f = %.0f", numero1, numero2, multiplicacao);
                    break;

                case 4:
                    double restoDivisao = 0;

                    System.out.println("| Calculo da Divisão |\n");

                    System.out.println("Digite o numero do DIVISOR:");
                    numero1 = leitorNumero.nextDouble();
                    System.out.println("Digite o numero do DIVIDENDO");
                    System.out.print(numero1+"/" );
                    numero2 = leitorNumero.nextDouble();

                    divisao = numero2 / numero1;

                    System.out.format("A divisão entre %.0f e %.0f = %.0f ", numero1, numero2, divisao);

                    restoDivisao = numero2 % numero1;

                    if (restoDivisao != 0) {
                        System.out.println("Houve resto: " + restoDivisao);
                    } else {
                        System.out.println("Não houve resto");
                    }

            }
        } while(opcaoOperacoes != 5);

    }

    public static void potenciasRaizes(){
        Scanner leitorNumero = new Scanner(System.in);
        int opcao = 0;

        double numero1 = 0;
        double numero2 = 0;

        do{
            System.out.println("\n\nCalculadora simples em Java");
            System.out.println("----------MENU----------\n");
            System.out.println("[1] Potência (a^b)/");
            System.out.println("[2] Raiz quadrada/");
            System.out.println("[3] Raiz cúbica");
            System.out.println("[4] Raiz N-ésima (a^(1/n))/");
            opcao = leitorNumero.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("| Calculo de Potência |");
                    System.out.println("________________________");
                    System.out.print("Base: ");
                    numero1 = leitorNumero.nextDouble();
                    System.out.print("Expoente: ");
                    numero2 = leitorNumero.nextDouble();

                    System.out.format("%.0f ^ %.0f = %.2f\n", numero1, numero2, pow(numero1, numero2));
                    System.out.println("________________________");
                    break;

                case 2:
                    System.out.println("| Calculo de Raiz Quadrada |");
                    System.out.println("________________________");
                    System.out.print("Numero: √");
                    numero1 = leitorNumero.nextDouble();

                    System.out.format("√%.0f = %.4f\n", numero1, sqrt(numero1));
                    System.out.println("________________________");
                    break;

                case 3:
                    System.out.println("| Calculo de Raiz Cúbica |");
                    System.out.println("________________________");
                    System.out.print("Numero: ∛");
                    numero1 = leitorNumero.nextDouble();

                    System.out.format("∛%.0f = %.4f\n", numero1, cbrt(numero1));
                    System.out.println("________________________");
                    break;

                case 4:
                    System.out.println("| Calculo de Raiz N-ésima |");
                    System.out.println("________________________");
                    System.out.print("Numero: ");
                    numero1 = leitorNumero.nextDouble();
                    System.out.print("Índice (n): ");
                    numero2 = leitorNumero.nextDouble();

                    System.out.format("%.0f^(1/%.0f) = %.4f\n", numero1, numero2, pow(numero1, 1.0/numero2));
                    System.out.println("________________________");
                    break;

            }

        }while(opcao != 5);
    }

    public static void estatistica(){
        Scanner leitorNumero = new Scanner(System.in);
        int opcao = 0;

        double numero1 = 0;
        double numero2 = 0;
        double soma = 0;;
        double mediaAritimetica = 0;
        double somaPonderada = 0;
        double somaPesos = 0;
        double pesos = 0;
        double desvioPadrao = 0;
        double variancia = 0;



        int numeros = 0; // Usado na Media

        do {
            System.out.println("\n\nCalculadora simples em Java");
            System.out.println("----------MENU----------\n");
            System.out.println("[1] Média Aritimética/");
            System.out.println("[2] Média Ponderada/");
            System.out.println("[3] Mediana/");
            System.out.println("[4] Desvio Padrão/");
            System.out.println("[5] Variancia/");
            System.out.println("[6] Máximo e Mínimo/");
            opcao = leitorNumero.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("| Calculo da Média Aritimética |");
                    System.out.println("________________________");
                    System.out.print("Quantos numeros? ");
                    numeros = leitorNumero.nextInt();

                    for(int i = 0; i < numeros; i++){
                        System.out.format("Digite numero [%d]: ", i + 1);
                        numero1 = leitorNumero.nextDouble();
                        soma += numero1;
                    }
                    mediaAritimetica = soma / numeros;
                    System.out.println("________________________");
                    System.out.format("Soma = %.0f\n", soma);
                    System.out.format("Média = %.2f\n", mediaAritimetica);
                    System.out.println("________________________");
                    break;

                case 2:
                    System.out.println("| Calculo da Média Ponderada |");
                    System.out.println("________________________");
                    System.out.print("Quantos numeros? ");
                    numeros = leitorNumero.nextInt();
                    System.out.println("________________________");
                    for(int i = 0; i < numeros; i++){
                        System.out.format("Digite numero [%d]: ", i + 1);
                        numero1 = leitorNumero.nextDouble();

                        System.out.format("Digite o peso [%d]: ", i + 1);
                        pesos = leitorNumero.nextDouble();

                        somaPonderada += numero1 * pesos;
                        somaPesos += pesos;
                    }
                    System.out.println("________________________");
                    double mediaPonderada = somaPonderada / somaPesos;
                    System.out.format("A média ponderada é: %.2f", mediaPonderada);
                    System.out.println("\n________________________");
                    break;

                case 3:
                    System.out.println("| Calculo da Média Ponderada |");
                    System.out.println("________________________");
                    System.out.println("Quantos numeros?");
                    int quantidade = leitorNumero.nextInt();

                    double[] numerosArray = new double[quantidade];

                    for (int i = 0; i < quantidade; i++) {
                        System.out.println("Digite o numero " + (i + 1) + ":");
                        numerosArray[i] = leitorNumero.nextDouble();
                    }

                    Arrays.sort(numerosArray);

                    double mediana;

                    if (quantidade % 2 != 0) {
                        // impar: pega o valor do meio
                        mediana = numerosArray[quantidade / 2];
                    } else {
                        // par: media dos dois valores centrais
                        int meio = quantidade / 2;
                        mediana = (numerosArray[meio - 1] + numerosArray[meio]) / 2;
                    }

                    System.out.format("A mediana é: %.2f", mediana);
                    break;

                case 4:

                    System.out.println("| Desvio Padrão |");
                    System.out.println("_____________________");
                    System.out.println("Quantos numeros?");
                    numeros = leitorNumero.nextInt();

                    double[] numerosArrayDesvio = new double[numeros];

                    for(int i = 0; i < numeros; i++){
                        System.out.format("Digite numero [%d]: ", i + 1);
                        numero1 = leitorNumero.nextDouble();
                        numerosArrayDesvio[i] = numero1;
                        soma += numero1;
                    }

                    mediaAritimetica = soma / numeros;

                    double somaQuadrados = 0;
                    for(int i = 0; i < numeros; i++){
                        double diferenca = numerosArrayDesvio[i] - mediaAritimetica;
                        somaQuadrados += diferenca * diferenca;
                    }

                    variancia = somaQuadrados / numeros;
                    desvioPadrao = Math.sqrt(variancia);

                    System.out.println("Variância = " + variancia);
                    System.out.println("Desvio padrão = " + desvioPadrao);

                    break;

                case 5:

                    break;

                case 6:

                    break;
            }

        }while(opcao != 7);
    }
}
