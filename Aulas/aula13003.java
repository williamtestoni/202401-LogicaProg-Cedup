package Aulas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;

public class aula13003 {
    public static void main(String args[]) {
        /*
            Exercício 1: Verificar se um número é positivo, negativo ou zero
            Exercício 2: Imprimir os números pares de 1 a 10
            Exercício 3: Calcular o fatorial de um número
            Exercício 4: Verificar se um número é primo
            Exercício 5: Calcular o somatório dos números de 1 a 100
            Exercício 6: Verificar se um número é par ou ímpar utilizando switch-case
            Exercício 7: Imprimir os números de 1 a 10 utilizando while
            Exercício 8: Calcular a média de 5 números, usando for para solicitar cada número
            Exercício 9: Contar de 10 a 1 utilizando for
            Exercício 10: Verificar se um ano é bissexto ou não
         */
        //exercicio1();
        //exercicio2();
        //exercicio3();
        //exercicio4();
        //exercicio5();
        //exercicio6();
        //exercicio7();
        //exercicio8();
        //exercicio9();
        //exercicio10();
        
        /*
            Exercício 11: Imprimir os números de 0 a 20, pulando de 2 em 2
            Exercício 12: Calcular o somatório dos números pares de 1 a 50
            Exercício 13: Calcular a média dos números pares de 1 a 100
            Exercício 14: Imprimir a tabuada de um número digitado pelo usuário
            Exercício 15: Verificar se um caractere é uma vogal ou uma consoante
            Exercício 16: Calcular a média dos números ímpares de 1 a 100
            Exercício 17: Verificar se um ano é um ano de copa do mundo (considerando a periodicidade de 4 anos, e a primeira copa ocorreu em 1930)
            Exercício 18: Simular o lançamento de um dado e imprimir o resultado
            Exercício 19: Calcular o IMC (Índice de Massa Corporal) de uma pessoa
            Exercício 20: Simular uma calculadora básica com as operações de adição, subtração, multiplicação e divisão (usando switch)
         */
        //exercicio11();
        //exercicio12();
        //exercicio13();
        //exercicio14();
        //exercicio15();
        //exercicio16();
        //exercicio17();
        //exercicio18();
        //exercicio19();
        //exercicio20();
        //jogoAdivinhacao();

        //exercicio21();
        //exercicio22();
        //exercicio23();
        exercicio24();
      }

    private static void exercicio1 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if(numero > 0) {
            System.out.println("O número é positivo.");
        } else if(numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }

    private static void exercicio2 () {
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    
    private static void exercicio3 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        for(int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }   

    private static void exercicio4 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        boolean primo = true;
        for(int i = 2; i <= numero/2; i++) {
            if(numero % i == 0) {
                primo = false;
                break;
            }
        }
        if(primo){
            System.out.println(numero + " é primo.");
        }
        else{
            System.out.println(numero + " não é primo.");
        }
            
    }

    private static void exercicio5 () {
        int soma = 0;
        for(int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }

    private static void exercicio6 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        switch(numero % 2) {
            case 0:
                System.out.println("O número é par.");
                break;
            case 1:
                System.out.println("O número é ímpar.");
                break;
        }
    }

    private static void exercicio7 () {
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    private static void exercicio8 () {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        for(int i = 1; i <= 5; i++) {
            System.out.println("Digite o número " + i + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }
        double media = soma / 5;
        System.out.println("A média dos números é: " + media);
    }

    private static void exercicio9 () {
        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    private static void exercicio10 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = scanner.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }

    private static void exercicio11 () {
        for(int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    //Exercício 12: Calcular o somatório dos números pares de 1 a 50
    private static void exercicio12 () {
        int soma = 0;
        for(int i = 2; i <= 50; i += 2) {
            soma += i;
        }
        System.out.println("A soma dos números pares de 1 a 50 é: " + soma);
    }

    //Exercício 13: Calcular a média dos números pares de 1 a 100
    private static void exercicio13 () {
        int soma = 0;
        int contador = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                soma += i;
                contador++;
            }
        }
        double media = (double) soma / contador;
        System.out.println("A média dos números pares de 1 a 100 é: " + media);
    }

    //Exercício 14: Imprimir a tabuada de um número digitado pelo usuário
    private static void exercicio14 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    //Exercício 15: Verificar se um caractere é uma vogal ou uma consoante
    private static void exercicio15 () {
        int soma = 0;
        int contador = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                soma += i;
                contador++;
            }
        }
        double media = (double) soma / contador;
        System.out.println("A média dos números pares de 1 a 100 é: " + media);
    }

    //Exercício 15: Verificar se um caractere é uma vogal ou uma consoante
    private static void exercicio16 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        if(caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' ||
           caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') {
            System.out.println(caractere + " é uma vogal.");
        } else {
            System.out.println(caractere + " é uma consoante.");
        }
    }

    //Exercício 17: Verificar se um ano é um ano de copa do mundo 
    //(considerando a periodicidade de 4 anos, e a primeira copa ocorreu em 1930)
    private static void exercicio17 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = scanner.nextInt();

        if((ano - 1930) % 4 == 0) {
            System.out.println(ano + " é um ano de Copa do Mundo.");
        } else {
            System.out.println(ano + " não é um ano de Copa do Mundo.");
        }
    }

    //Exercício 18: Simular o lançamento de um dado e imprimir o resultado
    private static void exercicio18 () {
        Random random = new Random();
        int resultado = random.nextInt(6) + 1; // números de 1 a 6
        System.out.println("O dado foi lançado e o resultado foi: " + resultado);
    }

    //Exercício 19: Calcular o IMC (Índice de Massa Corporal) de uma pessoa
    private static void exercicio19 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o peso em kg: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("O IMC é: " + imc);
    }

    //Exercício 20: Simular uma calculadora básica com as operações de adição, subtração, multiplicação e divisão (usando switch)
    private static void exercicio20 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int escolha = scanner.nextInt();

        double resultado = 0;
        switch(escolha) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if(numero2 != 0)
                    resultado = numero1 / numero2;
                else
                    System.out.println("Erro: divisão por zero.");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        System.out.println("O resultado da operação é: " + resultado);
    }

    private static void jogoAdivinhacao (){
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // número de 1 a 100
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        
        while(true) {
            System.out.println("Tente adivinhar o número: ");
            int palpite = scanner.nextInt();
            tentativas++;
            
            if(palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                break;
            } else if(palpite < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }
    }

    //Exercício 21: Inverter uma string
    private static void exercicio21(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();
        
        String invertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }
        
        System.out.println("A string invertida é: " + invertida);
    }

    //Exercício 22: Calcular o número de dias entre duas datas
    private static void exercicio22(){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.print("Digite a primeira data (dd/MM/yyyy): ");
        String data1Str = scanner.nextLine();
        LocalDate data1 = LocalDate.parse(data1Str, formatter);
        
        System.out.print("Digite a segunda data (dd/MM/yyyy): ");
        String data2Str = scanner.nextLine();
        LocalDate data2 = LocalDate.parse(data2Str, formatter);
        
        long dias = ChronoUnit.DAYS.between(data1, data2);
        
        System.out.println("Número de dias entre as datas: " + Math.abs(dias));
    }


    private static void exercicio23(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas da pirâmide: ");
        int linhas = scanner.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= linhas - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }


    private static void exercicio24(){
        
    }


    private static void exercicio25(){
    
    }
}
