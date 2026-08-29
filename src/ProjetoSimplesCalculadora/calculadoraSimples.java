package ProjetoSimplesCalculadora;

import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Math.*;


public class calculadoraSimples {
    public static void main(String[] args){

        Scanner leitorOpcao = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n-----MENU PRINCIPAL-----\n");
            System.out.println("[1] Operações Basicas (+ -  x  ÷ )/");
            System.out.println("[2] Potencias e raizes/");
            System.out.println("[3] Estatística (media, media, desvio...)/");
            System.out.println("[4] Conversor (temp., ângulo, distância etc)/");
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
                case 4:
                    conversor();
            }

        }while(opcao != 5);
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
                    System.out.println("________________________");
                    System.out.println("| Calculo de soma | ");
                    System.out.println("________________________");
                    numero1 = leitorNumero.nextDouble();
                    System.out.println("+");
                    numero2 = leitorNumero.nextDouble();

                    soma = numero1 + numero2;
                    System.out.format("A soma entre %.0f e %.0f = %.0f", numero1, numero2, soma);
                    break;

                case 2:
                    System.out.println("________________________");
                    System.out.println("| Calculo de Subtração |");
                    System.out.println("________________________");
                    numero1 = leitorNumero.nextDouble();
                    System.out.println("-");
                    numero2 = leitorNumero.nextDouble();

                    subtracao = numero1 - numero2;
                    System.out.format("A subtração entre %.0f e %.0f = %.0f", numero1, numero2, subtracao);
                    break;

                case 3:
                    System.out.println("________________________");
                    System.out.println("| Calculo de Multiplicação | ");
                    System.out.println("________________________");
                    numero1 = leitorNumero.nextDouble();
                    System.out.println(".");
                    numero2 = leitorNumero.nextDouble();

                    multiplicacao = numero1 * numero2;
                    System.out.format("A multiplicação entre %.0f e %.0f = %.0f", numero1, numero2, multiplicacao);
                    break;

                case 4:
                    double restoDivisao = 0;

                    System.out.println("________________________");
                    System.out.println("| Calculo da Divisão | ");
                    System.out.println("________________________");

                    System.out.println("Digite o numero do DIVISOR:");
                    numero1 = leitorNumero.nextDouble();
                    System.out.println("Digite o numero do DIVIDENDO");
                    System.out.print(numero1+"/" );
                    numero2 = leitorNumero.nextDouble();

                    divisao = numero2 / numero1;
                    System.out.println("________________________");
                    System.out.format("A divisão entre %.0f e %.0f = %.0f \n", numero1, numero2, divisao);
                    System.out.println("________________________");
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
            System.out.println("[5] Voltar ao menu principal/");
            System.out.println("| Digite um numero para escolha |\n");
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
            System.out.println("[4] Desvio Padrão e Variância/");
            System.out.println("[5] Máximo e Mínimo/");
            System.out.println("[6] Voltar ao menu principal/");
            System.out.println("| Digite um numero para escolha |\n");
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
                    System.out.println("| Maximo e Minimo |");
                    System.out.println("_____________________");
                    System.out.println("Quantos numeros?");
                    numeros = leitorNumero.nextInt();


                    System.out.format("Digite numero [1]: ");
                    double numeroMN = leitorNumero.nextDouble();

                    double maximo = numeroMN;
                    double minimo = numeroMN;

                    for(int i = 0; i < numeros - 1; i++){
                        System.out.format("Digite numero [%d]: ", i + 2);
                        numeroMN = leitorNumero.nextDouble();

                        if(numeroMN > maximo){
                            maximo = numeroMN;
                        }
                        if(numeroMN < minimo){
                            minimo = numeroMN;
                        }
                    }

                    System.out.println("Maximo = " + maximo);
                    System.out.println("Minimo = " + minimo);

                    break;

            }

        }while(opcao != 6);
    }

    public static void conversor(){
        Scanner leitorNumero = new Scanner(System.in);
        int opcao = 0;
        double graus = 0;
        double radianos = 0;

        double PI = 3.1415f;
        int fahrenheit = 0;
        int celsius = 0;
        double quilometros = 0;
        double milhas = 0;

        do {
            System.out.println("\n\nCalculadora simples em Java");
            System.out.println("----------MENU----------\n");
            System.out.println("[1] Graus  → Radianos/");
            System.out.println("[2] Radianos  → Graus/");
            System.out.println("[3] Celsius  → Fahrenheit/");
            System.out.println("[4] Fahrenheit → Celsius/");
            System.out.println("[5] Celsius → Kelvin/");
            System.out.println("[6] Km → Milhas/");
            System.out.println("[7] Milhas → Km/");
            System.out.println("[8] Voltar ao menu principal/");
            System.out.println("| Digite um numero para escolha |\n");

            opcao = leitorNumero.nextInt();

            switch (opcao){

                case 1:

                    System.out.println("| Graus  → Radianos |");
                    System.out.println("________________________");
                    System.out.print("Digite Quantos Graus: ");
                    graus = leitorNumero.nextInt();
                    radianos = (graus * PI) / 180;
                    System.out.println("________________________");
                    System.out.format("Radianos ≈ %.4f", radianos);
                    System.out.println("\n________________________");
                    break;

                case 2:
                    System.out.println("| Radianos  → Graus |");
                    System.out.println("________________________");
                    System.out.println("Digite Quantos Radianos: ");
                   radianos = leitorNumero.nextDouble();

                    graus = radianos * (180 / PI);

                    System.out.println("________________________");
                    System.out.format("Graus ≈ %.1f", graus);
                    System.out.println("\n________________________");
                    break;

                case 3:
                    System.out.println("Celsius  → Fahrenheit");
                    System.out.println("________________________");
                    System.out.println("Digite quantos Graus Celsius: ");
                    celsius = leitorNumero.nextInt();

                    fahrenheit = ((celsius * 9) / 5) + 32;

                    System.out.println("________________________");
                    System.out.format("Fahrenheit = %d °F", fahrenheit);
                    System.out.println("\n________________________");
                    break;

                case 4:
                    System.out.println("Fahrenheit → Celsius");
                    System.out.println("________________________");
                    System.out.println("Digite quantos Graus Fahrenheit: ");
                    fahrenheit = leitorNumero.nextInt();

                    celsius = ((fahrenheit - 32) * 5) / 9;

                    System.out.println("________________________");
                    System.out.format("Celsius = %d °C", celsius);
                    System.out.println("\n________________________");
                    break;

                case 5:
                    System.out.println("Celsius → Kelvin");
                    System.out.println("________________________");
                    System.out.println("Digite quantos Graus Celsius: ");
                    celsius = leitorNumero.nextInt();

                    System.out.println("________________________");
                    System.out.format("Kelvin = %d K", celsius + 273);
                    System.out.println("\n________________________");
                    break;

                case 6:
                    System.out.println("Km → Milhas");
                    System.out.println("________________________");
                    System.out.println("Digite quantos Km: ");
                    quilometros = leitorNumero.nextDouble();

                    milhas = quilometros * 0.621371f;

                    System.out.println("________________________");
                    System.out.format("Milhas = %.2f", milhas);
                    System.out.println("\n________________________");
                    break;

                case 7:
                    System.out.println("Milhas → Km");
                    System.out.println("________________________");
                    System.out.println("Digite quantas milhas: ");
                    milhas = leitorNumero.nextDouble();

                    quilometros = milhas / 0.621371f;

                    System.out.println("________________________");
                    System.out.format("Quilometros = %.2f", quilometros);
                    System.out.println("\n________________________");
                    break;
            }
        }while(opcao != 8);
    }
}
