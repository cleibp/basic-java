import java.util.Scanner;

enum Cor { Vermelho, Verde, Azul, Amarelo, Laranja }

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    String nome = "Cleiton";
    int idade = 20;
    char sexo = 'M';
    double peso = 70.5;
    boolean ativo = true;

    int val1, val2, adicao, subtracao, multiplicacao, divisao, modulo;

    int idadeTernario;
    String idadeTer;

    int idadeIF;

    int dia;

    int a = 0;

    int b = 0;

    int c = 0;
    int m = 0;
    int n = 0;

    int numero1, numero2, res;

    final double PI = 3.14159265;

    // Comentário de uma linha

    /*
     * Comentário
     * de varias linhas
     */

    // ESCREVER NA TELA
    System.out.println("#### ESCREVER NA TELA ####");
    System.out.println("Olá Mundo");
    System.out.println("");

    // VARIÁVEIS
    System.out.println("### VARIÁVEIS E TIPOS BÁSICOS ###");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Sexo: " + sexo);
    System.out.println("Peso: " + peso);
    System.out.println("Ativo: " + ativo);
    System.out.println("");

    // CONSTANTE
    System.out.println("### CONSTANTE ###");
    System.out.println("PI: " + PI);
    System.out.println("");

    // OPERACOES
    System.out.println("#### OPERACOES ####");
    System.out.print("Informe o valor 1: ");
    val1 = myObj.nextInt();

    System.out.print("Informe o valor 2: ");
    val2 = myObj.nextInt();

    adicao = val1 + val2; // Pode usar: (+, -, *, /, %)
    subtracao = val1 - val2;
    multiplicacao = val1 * val2;
    divisao = val1 / val2;
    modulo = val1 % val2;
    System.out.println("Soma: " + adicao);
    System.out.println("Subtracao: " + subtracao);
    System.out.println("Multiplicacao: " + multiplicacao);
    System.out.println("Divisao: " + divisao);
    System.out.println("Modulo: " + modulo);
    System.out.println("");

    
    // TERNARIO
    System.out.println("### TERNARIO ###");
    System.out.print("Digite um número: ");
    idadeTernario = myObj.nextInt();
    idadeTer = idadeTernario >= 18 ? "Maior de idade" : "Menor de idade";
    System.out.println(idadeTer);
    System.out.println("");

    
    // IF ELSE IF ELSE
    System.out.println("### IF ELSE IF ELSE ###");
    System.out.print("Informe a idade: ");
    idadeIF = myObj.nextInt();
    if (idadeIF < 12) {
      System.out.println("CRIANCA");
    } else if ((idadeIF >= 12) && (idadeIF < 18)) {
      System.out.println("ADOLESCENTE");
    } else {
      System.out.println("ADULTO");
    }
    System.out.println("");

    // CASE
    System.out.println("### CASE ###");
    System.out.print("Informe um numero 1 - 7 para semana: ");
    dia = myObj.nextInt();

    switch (dia) {

      case 1:
        System.out.println("Domingo");
        break;

      case 2:
        System.out.println("Segunda");
        break;

      case 3:
        System.out.println("Terça");
        break;

      case 4:
        System.out.println("Quarta");
        break;

      case 5:
        System.out.println("Quinta");
        break;

      case 6:
        System.out.println("Sexta");
        break;

      case 7:
        System.out.println("Sabado");
        break;

      default:
        System.out.println("Valor nao existente");
        break;
    }
    System.out.println("");

    // REPEAT
    System.out.println("### REPEAT ###");
    System.out.println("Não tem REPEAT");
    System.out.println("");

    // DO WHILE
    System.out.println("### DO WHILE ###");
    do {
      System.out.println(a);
      a = a + 1;
    } while (a < 10);
    System.out.println("");

    // WHILE
    System.out.println("### WHILE ###");
    while (b < 10) {
      System.out.println(b);
      b = b + 1;
    }
    System.out.println("");

    // FOR
    System.out.println("### FOR ###");
    for (c = 0; c < 10; c++) {
      System.out.println(c);
    }
    System.out.println("");

    // ARRAY
    System.out.println("### ARRAY ###");
    int[] numbers = {10, 20, 30, 40};

    for (int i = 0; i < 4; i++) {
        System.out.println(numbers[i]);
    }
    System.out.println();

    // MATRIZ
    System.out.println("### MATRIZ ###");
    int[][] matriz = new int[3][3]; // Declaração de uma matriz 3x3 de inteiros

    // Inicialização da matriz
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz[i][j] = i * 3 + j + 1;
        }
    }

    // Acesso aos elementos da matriz
    System.out.println("Elementos da matriz:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println();

    // FUNCAO
    System.out.println("### FUNCAO ###");
    System.out.print("Digite o valor 1: ");
    m = myObj.nextInt();

    System.out.print("Digite o valor 2: ");
    n = myObj.nextInt();
    
    int resultado = soma(m, n);    
    System.out.println("A soma de " + m + " e " + n + " é igual a " + resultado);

    System.out.println("");
    
    // PROCEDURE
    System.out.println("### PROCEDURE ###");
    System.out.println("Não tem PROCEDURE");
    System.out.println("");

    // PONTEIRO
    System.out.println("### PONTEIRO ###\n");
    System.out.println("Não tem PONTEIRO \n");
    System.out.println(" Não é necessário liberar memória manualmente, como em C ou C++. A variável será automaticamente coletada pelo coletor de lixo quando não estiver mais em uso. \n");
    System.out.println("\n");

    // TRY
    System.out.println("### TRY ###\n");
    System.out.print("Informe o valor 1 para o dividendo: ");
    numero1 = myObj.nextInt();

    System.out.print("Informe o valor 2 para o divisor: ");
    numero2 = myObj.nextInt();

    try {
        if (numero2 == 0) {
            throw new Exception("Divisão por zero não é permitida!");
        }
        res = numero1 / numero2;
        System.out.println("Resultado da divisão: " + res);
    } catch (Exception e) {
        System.out.println("Ocorreu uma exceção: " + e.getMessage());
    }
    System.out.println("\n");

    // ENUM
    System.out.println("### ENUM ###\n");
    Cor minhaCor = Cor.Azul;
    switch (minhaCor) {
        case Vermelho:
            System.out.println("Minha cor favorita é vermelho.");
            break;
        case Verde:
            System.out.println("Minha cor favorita é verde.");
            break;
        case Azul:
            System.out.println("Minha cor favorita é azul.");
            break;
        case Amarelo:
            System.out.println("Minha cor favorita é amarelo.");
            break;
        case Laranja:
            System.out.println("Minha cor favorita é laranja.");
            break;
        default:
            System.out.println("Eu não tenho uma cor favorita.");
    }
    System.out.println("\n");
  }
  public static int soma(int a, int b) {
    return a + b;
  }
}
