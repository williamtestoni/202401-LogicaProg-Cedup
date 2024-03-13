package Aulas;

import java.util.Scanner;

public class aula13003 {
    public static void main(String args[]) {

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
        if(primo)
            System.out.println(numero + " é primo.");
        else
            System.out.println(numero + " não é primo.");
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base: ");
        double base = scanner.nextDouble();
        System.out.println("Digite o expoente: ");
        int expoente = scanner.nextInt();

        double resultado = 1;
        for(int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
    }

    private static void exercicio12 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int somaDivisores = 0;
        for(int i = 1; i < numero; i++) {
            if(numero % i == 0) {
                somaDivisores += i;
            }
        }
        if(somaDivisores == numero) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }
    }

    private static void exercicio13 () {
        for(int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    private static void exercicio14 () {
        int soma = 0;
        for(int i = 2; i <= 50; i += 2) {
            soma += i;
        }
        System.out.println("A soma dos números pares de 1 a 50 é: " + soma);
    }

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

    private static void exercicio16 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    private static void exercicio17 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        int i = 1;
        while(i <= numero) {
            fatorial *= i;
            i++;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

    private static void exercicio18 () {
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

    private static void exercicio19 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        boolean quadradoPerfeito = false;
        for(int i = 1; i <= numero; i++) {
            if(i * i == numero) {
                quadradoPerfeito = true;
                break;
            }
        }
        if(quadradoPerfeito) {
            System.out.println(numero + " é um quadrado perfeito.");
        } else {
            System.out.println(numero + " não é um quadrado perfeito.");
        }
    }

    private static void exercicio20 () {
        int soma = 0;
        int contador = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 != 0) {
                soma += i;
                contador++;
            }
        }
        double media = (double) soma / contador;
        System.out.println("A média dos números ímpares de 1 a 100 é: " + media);
    }

}
