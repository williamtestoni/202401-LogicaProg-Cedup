import java.util.Scanner;

public class basico {
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
  }

  //Crie um programa e apresente o Ola mundo na tela
  private static void exercicio1 (){
    System.out.println("Olá mundo!");
  }

  /*
   * Crie um programa e declare nele 3 variáveis numéricas int, 
   * inicializando-as com algum valor e obtenha a soma dessas variáveis e a média delas, 
   * imprimindo esses resultados na tela
   */
  private static void exercicio2 (){
    double nm1 = 4;
    double nm2 = 6;
    double nm3 = 2;

    System.out.println("A Media dos numeros é: "+ ((nm1+nm2+nm3)/3));
  }

  /*
   * Crie um programa que calcule a área de um retângulo,
   * declare e inicialize duas variáveis para testá-lo, 
   * imprimindo esses resultados na tela.
   */
  private static void exercicio3 (){
    int base = 10;
    int altura = 10;

    int resultado = (base * altura);

    System.out.println("A area do retangulo é: "+ resultado);
  }

  /*
   * Crie um programa que elabore o orçamento de uma 
   * construtora para o cálculo do valor total de 
   * construção de uma piscina. O valor total será 
   * dado pela cubagem da piscina (metros cúbicos) 
   * multiplicada por R$100,00, que é o preço do metro cúbico 
   * construído de piscina. 
   */
  private static void exercicio4 (){
    double alt = 5;
    double largura = 3;
    double comprimento = 7;

    double resultado = alt * largura * comprimento;
    double valorPiscina = resultado * 100;

    System.out.println("O valor total da piscina é : R$"+ valorPiscina);
  }

  private static void exercicio5 (){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int numero = entrada.nextInt();

    System.out.println("O numero digitado é: "+ numero);
    System.out.println("Antecessor: "+ (numero-1));
    System.out.println("Sucessor: "+ (numero+1));
    System.out.println("numero multiplicado por 5: "+ (numero*5));
  }

  private static void exercicio6(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um valor: ");
    double valor = entrada.nextDouble();

    //Calculo de porcentagem
    double resultado = (valor*0.01)+valor;

    System.out.println("O resultado é: "+ resultado);
  }

  private static void exercicio7(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um Nome: ");
    String nome = entrada.nextLine(); 

    System.out.println("Digite o preço do produto: ");
    Double preco = entrada.nextDouble(); 

    double precoComAumento = preco+preco*0.65;

    System.out.println("O produto: "+ nome +", valor final: R$"+ precoComAumento);
  }

  private static void exercicio8 (){

  }

  private static void exercicio9() {
    double C, K, F, Re, Ra;
    C = 28;

    F = C * 1.8 + 32;
    K = C + 273.15;
    Ra = C * 1.8 + 32 + 459.67;
    Re = C * 0.8;

    System.out.println("A temperatura em Celsius é: " + F);
    System.out.println("A temperatura em Fahrenheit é: " + F);
    System.out.println("A temperatura em Kelvin é: " + K);
    System.out.println("A temperatura em Reaumur é: " + Ra);
    System.out.println("A temperatura em Rankine é: " + Re);
  }
}

  private static void exercicio10() {
  int sexo, qtMulheres=0, qtHomens=0;
        float altura, somaH=0, mediaHomens=0, maior=0, menor=0;

        Scanner entrada = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
            sexo = entrada.nextInt();
            System.out.print("Digite a altura: ");
            altura = entrada.nextFloat();
            if (sexo == 1) {
                qtMulheres++;
            } else if (sexo == 2) {
                qtHomens++;
                somaH = somaH + altura;
            } else {
                System.out.println("Opção sexo inválido!");
            }
            if (altura > maior) {
                 maior = altura;
            } else if (altura < menor){
                menor = altura;
            }
        }
        mediaHomens = somaH / qtHomens;

        System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
        System.out.println("A média de altura dos homens é " + mediaHomens + " m");
        System.out.println("O número de mulheres é " + qtMulheres);

        entrada.close();
}

  private static void exercicio11(){
    double n1, n2, n3, n4, media;

      n1 = 3453.21;
      n2 = 3498.43;
      n3 = 7902.09;
      n4 = 12932.00;

      media = (n1 + n2 + n3 + n4) / 4;
      System.out.println("A média salarial da empresa é de R$ " + media);
  }

  private static void exercicio12(){
    double hp, lp, ha, la, qtd;

    hp = 2.6;
    lp = 1.6;
    ha = 0.35;
    la = 0.3;

    qtd = (hp * lp) / (ha * la);

    System.out.println("Quantidade de azulejos necessários para cobrir a parede: " + qtd);     
  }
  
  private static void exercicio13(){
    double V, R, A;
    R = 3.2;
    A = 4.9;

    V = 3.14159 * R * R * A;
    System.out.println("O volume da lata de óleo é de " + V + " m³");
  }

  private static void exercicio14(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a distancia: ");
    double distancia = entrada.nextDouble(); 

    System.out.println("Digite a velocidade media: ");
    double velocidadeMedia = entrada.nextDouble();

    System.out.println("O tempo necessario para chegar é: "+ (distancia/velocidadeMedia) + " horas");
  }

  private static void exercicio15(){
    double m, h, t, cavalos;
    m = 21;
    h = 2.2;
    t = 1.4;

    cavalos = (m * h / t) / 745.6999;

    System.out.println("A quantidade de cavalos necessários é " + cavalos);
  }
