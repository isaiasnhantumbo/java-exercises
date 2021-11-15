import java.util.Scanner;

public class Exercicio13 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Digite o valor da base");
    double base = input.nextDouble();

    System.out.print("Digite o valor da altura");
    double height = input.nextDouble();

    double p = 2 * (base + height);

    System.out.println("O perimetro do rectangulo: " + p);

  }
}
