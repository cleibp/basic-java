import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    String nome = "Cleiton";
    int idade = 20;
    char sexo = 'M';
    double peso = 70.5;
    // boolean ativo = true;

    int val1, val2, soma, subtracao, multiplicacao, divisao, modulo;

    int idadeTernario;
    String idadeTer;

    int idadeIF;

    int dia;

    int a = 0;

    int b = 0;

    int c = 0;

    final double PI = 3.14159265;

    // Comentário de uma linha

    /*
     * Comentário
     * de varias linhas
     */

    // Escrever na tela
    System.out.println("Hello world!");
    System.out.println("");

    // VARIÁVEIS
    System.out.println("### IMPRIMINDO VARIÁVEIS ###");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Sexo: " + sexo);
    System.out.println("Peso: " + peso);
    // System.out.println(ativo);
    System.out.println("");

    // CONSTANTE
    System.out.println("### IMPRIMINDO CONSTANTE ###");
    System.out.println("PI: " + PI);
    System.out.println("");

    
    System.out.println("#### OPERACOES ####");
    System.out.print("Informe o valor 1: ");
    val1 = myObj.nextInt();

    System.out.print("Informe o valor 2: ");
    val2 = myObj.nextInt();

    soma = val1 + val2; // Pode usar: (+, -, *, /, %)
    subtracao = val1 - val2;
    multiplicacao = val1 * val2;
    divisao = val1 / val2;
    modulo = val1 % val2;
    System.out.println("Soma: " + soma);
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

  }
}
