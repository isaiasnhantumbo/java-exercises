import java.util.Scanner;

public class Exercicio11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o preço do produto");
    double price = input.nextDouble();

    System.out.print("Digite o codigo do produto");
    char code = input.next().charAt(0);

    switch (code) {
    case '1':
      System.out.println("O produto: " + price + " provinente do Sul");
      break;
    case '2':
      System.out.println("O produto: " + price + " provinente do Centro");
      break;
    case '3':
      System.out.println("O produto: " + price + " provinente do Norte");
      break;
    default:
      System.out.println("O produto: " + price + " foi importado");

    }

  }
}
